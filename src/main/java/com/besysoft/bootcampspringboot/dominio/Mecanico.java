package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

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
}
