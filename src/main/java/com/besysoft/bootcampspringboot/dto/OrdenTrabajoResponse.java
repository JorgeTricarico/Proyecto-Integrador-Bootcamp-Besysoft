package com.besysoft.bootcampspringboot.dto;

import com.besysoft.bootcampspringboot.dto.EmpleadoResponse;
import com.besysoft.bootcampspringboot.dto.VehiculoResponse;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrdenTrabajoResponse {


    private Long id;

    private Integer cantidadCuotas;

    private String detalleFalla;

    private String estado;

    private LocalDateTime fechaIngreso;

    private LocalDateTime fechaFinReparacion;

    private LocalDateTime fechaPago;

    private String formaPago;

    private BigDecimal importeTotal;

    private Long kilometraje;

    private Long nivelCombustible;

    private Long tipoTarjeta;

    private EmpleadoResponse administrativo;

    private EmpleadoResponse recepcionista;

    private VehiculoResponse vehiculo;
}
