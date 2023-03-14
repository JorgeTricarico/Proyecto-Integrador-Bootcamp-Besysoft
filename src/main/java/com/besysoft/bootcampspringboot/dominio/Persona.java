package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 100, name = "NOMBRES", nullable = false) //length = 30,
    private String nombres;

    @Column(length = 80, name = "APELLIDO", nullable = false)
    private String apellido;

    @Column(length = 15, name = "CELULAR")
    private String celular;

    @Column(length = 255, name = "CALLE", nullable = false)
    private String calle;

    @Column(length = 255, name = "NUMERO_DE_CALLE", nullable = false)
    private String numeroDeCalle;

    @Column(length = 255, name = "LOCALIDAD", nullable = false)
    private String localidad;

    @Column(length = 255, name = "CODIGO_POSTAL", nullable = false)
    private String codigoPostal;

    @Column(length = 255, name = "PISO")
    private String piso;

    @Column(length = 255, name = "DEPARTAMENTO")
    private String departamento;
}
