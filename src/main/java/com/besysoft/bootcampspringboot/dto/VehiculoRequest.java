package com.besysoft.bootcampspringboot.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class VehiculoRequest {

    @NotBlank(message = "El año no puede estar vacio o ser nulo")
    private Integer anio;

    @NotBlank(message = "El color no puede estar vacio o ser nulo")
    private String color;

    @NotBlank(message = "La marca puede estar vacio o ser nulo")
    private String marca;

    @NotBlank(message = "El color no puede estar vacio o ser nulo")
    private String modelo;

    @NotBlank(message = "El color no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[A-Z0-9 ]+$", message = "La patente solamente puede contener letras mayusculas y numeros")
    private String patente;
}
