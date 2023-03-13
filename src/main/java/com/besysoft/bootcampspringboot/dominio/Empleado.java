package com.besysoft.bootcampspringboot.dominio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false, exclude = "id")

@Table(name = "Empleados")
public class Empleado extends Persona implements Serializable {

    @Column(length = 255, name = "TIPO_EMPLEADO", nullable = false)
    private String tipoEmpleado;
}
