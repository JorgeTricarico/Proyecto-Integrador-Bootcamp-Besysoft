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
@Table(name = "Clientes")

public class Cliente extends Persona implements Serializable {

    @Column(length = 255, name = "CORREO_ELECTRONICO", nullable = false)
    private String correoElectronico;

    @Column(length = 15, name = "TELEFONO_DE_LINEA", nullable = false)
    private String telefonoDeLinea;
}
