package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "Mano_Obra")
public class ManoObra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DETALLE", nullable = false)
    private String detalle;

    @Column(name = "DURACION_HS", nullable = false)
    private LocalTime duracionHs;

    @ManyToOne
    @JoinColumn(name = "MECANICO_ID", nullable = false)
    private Mecanico mecanico;

    @ManyToOne
    @JoinColumn(name = "ORDEN_TRABAJO_ID", nullable = false)
    private OrdenTrabajo ordenTrabajo;
}
