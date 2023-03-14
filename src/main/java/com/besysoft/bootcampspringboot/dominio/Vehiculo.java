package com.besysoft.bootcampspringboot.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "Vehiculos")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ANIO", nullable = false)
    private Integer anio;

    @Column(length = 255, name = "COLOR", nullable = false)
    private String color;

    @Column(length = 255, name = "MARCA", nullable = false)
    private String marca;

    @Column(length = 255, name = "MODELO", nullable = false)
    private String modelo;

    @Column(length = 255, name = "PATENTE", nullable = false, unique = true)
    private String patente;

    @ManyToMany
    @JoinTable(
            name= "CLIENTE_VEHICULO",
            joinColumns = @JoinColumn(name = "CLIENTE_ID"),
            inverseJoinColumns = @JoinColumn (name = "VEHICULO_ID"))
    private List<Cliente> clientes;

    @OneToMany
    @JoinColumn(name = "ORDEN_TRABAJO_ID")
    private List<OrdenTrabajo> ordenTrabajoId;



}
