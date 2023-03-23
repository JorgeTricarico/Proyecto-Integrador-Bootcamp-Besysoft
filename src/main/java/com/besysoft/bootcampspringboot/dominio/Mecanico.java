package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "Mecanicos")
public class Mecanico extends Persona implements Serializable {

    @Column(name = "ACTIVO", nullable = false)
    private char activo;

    @Column(length = 255, name = "ESPECIALIDAD", nullable = false)
    private String especialidad;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mecanico")
    private Set<ManoObra> manosDeObra;
}
