package com.besysoft.bootcampspringboot.dto;


import com.besysoft.bootcampspringboot.dominio.Vehiculo;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
public class ClienteRequest {
    @NotBlank(message = "El nombre no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "El nombre solo debe contener letras")
    private String nombres;

    @NotBlank(message = "El apellido no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "El apellido solo debe contener letras")
    private String apellido;

    @NotBlank(message = "El nombre no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[0-9+]+$", message = "El celular solo debe contener letras")
    private String celular;

    @NotBlank(message = "El nombre de calle no puede estar vacia o ser nula")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "La calle solo debe contener letras y numeros")
    private String calle;

    @NotBlank(message = "El celular no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[0-9]+$", message = "El numero de calle solo debe contener letras y numeros")
    private String numeroDeCalle;

    @NotBlank(message = "La localidad no puede estar vacia o ser nula")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "La localidad solo debe contener letras y numeros")
    private String localidad;

    @NotBlank(message = "El codigo postal no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "El codigo postal solo debe contener letras y numeros")
    private String codigoPostal;

    @NotBlank(message = "El piso no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "El piso solo debe contener letras y numeros")
    private String piso;

    @NotBlank(message = "El departamento no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "El piso solo debe contener letras y numeros")
    private String departamento;

    @NotBlank(message = "El correo electronico no puede estar vacio o ser nulo")
    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
            message = "El correo electronico debe tener un formato valido")
    private String correoElectronico;

    @Pattern(regexp = "^[0-9]+$", message = "El numero de calle solo debe contener letras y numeros")
    private String telefonoDeLinea;

}
