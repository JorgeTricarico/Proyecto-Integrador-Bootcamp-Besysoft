package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "Detalle_Ordenes_Trabajo")
public class DetalleOrdenTrabajo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "VALOR_TOTAL", precision=19, scale=2)
    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "ORDEN_TRABAJO_ID")
    private OrdenTrabajo ordenTrabajo;

    @ManyToOne
    @JoinColumn(name = "REPUESTO_ID")
    private Repuesto repuesto; //List<Repuesto> repuestos;

}
