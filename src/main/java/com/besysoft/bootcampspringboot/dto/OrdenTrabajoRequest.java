package com.besysoft.bootcampspringboot.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class OrdenTrabajoRequest {

    @NotBlank(message = "El nivel del combustible no puede ser nulo o estar vacio")
    private String nivelCombustible;

    @NotBlank
    @Min(message = "El kilometraje no puede ser menor a 0", value = 0)
    private Long kilometraje;

    @NotBlank(message = "El detalle de la falla no puede ser nulo o vacío")
    @Size(message = "El detalle de la falla no puede ser mayor a 255 carácteres", max = 255)
    private String detallaFalla;
}
