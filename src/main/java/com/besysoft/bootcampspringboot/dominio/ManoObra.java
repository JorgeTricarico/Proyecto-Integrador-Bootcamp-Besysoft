package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "Mano_Obra")
public class ManoObra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DETALLE", nullable = false)
    String detalle;

    @Column(name = "DURACION_HS", nullable = false)
    LocalTime duracionHs;

    @OneToOne
    @Column(name = "MECANICO_ID", nullable = false)
    Mecanico mecanicoId;

    @OneToOne
    @Column(name = "ORDEN_TRABAJO_ID", nullable = false)
    OrdenTrabajo ordenTrabajoId;
}
