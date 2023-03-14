package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "Detalle_Ordenes_Trabajo")
public class DetalleOrdenTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;

    @OneToOne
    @Column(name = "ORDEN_TRABAJO_ID")
    OrdenTrabajo ordenTrabajoId;

    @OneToMany
    @Column(name = "REPUESTO_ID")
    Repuesto repuestoId;

}
