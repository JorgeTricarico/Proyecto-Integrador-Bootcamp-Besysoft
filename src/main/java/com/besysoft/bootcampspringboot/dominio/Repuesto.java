package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "Repuestos")
public class Repuesto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 255, name = "MARCA", nullable = false)
    private String marca;

    @Column(length = 255, name = "MODELO", nullable = false)
    private String modelo;

    @Column(length = 255, name = "REPUESTO", nullable = false)
    private String repuesto;

    @Column(name = "VALOR", nullable = false)
    private BigDecimal valor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "repuesto")
    private Set<DetalleOrdenTrabajo> detalleOrdenesTrabajo;
    /*@ManyToOne
    @JoinColumn(name = "DETALLE_ORDEN_TRABAJO", nullable = false)
    private DetalleOrdenTrabajo detalleOrdenTrabajo;*/
}
