package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "Ordenes_Trabajo")
public class OrdenTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CANTIDAD_DE_CUOTAS")
    private Integer cantidadCuotas;

    @Column(name = "DETALLE_FALLA")
    private String detalleFalla;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "FECHA_INGRESO")
    private LocalDateTime fechaIngreso;

    @Column(name = "FECHA_FIN_REPARACION")
    private LocalDateTime fechaFinReparacion;

    @Column(name = "FECHA_PAGO")
    private LocalDateTime fechaPago;

    @Column(name = "FORMA_PAGO")
    private String formaPago;

    @Column(name = "IMPORTE_TOTAL")
    private Double importeTotal;

    @Column(name = "KILOMETRAJE")
    private Long kilometraje;

    @Column(name = "NIVEL_COMBUSTIBLE")
    private Long nivelCombustible;

    @Column(name = "TIPO_TARJETA")
    private Long tipoTarjeta;

    @ManyToOne
    @Column(name = "ADMINISTRATIVO_ID")
    private Empleado administrativoId;

    @ManyToOne
    @Column(name = "RECEPCIONISTA_ID")
    private Empleado recepcionistaId;

    @ManyToOne
    @Column(name = "VEHICULO_ID")
    private Vehiculo vehiculoId;

}
