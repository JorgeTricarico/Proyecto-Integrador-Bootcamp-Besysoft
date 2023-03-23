package com.besysoft.bootcampspringboot.controller;


import com.besysoft.bootcampspringboot.dto.OrdenTrabajoRequest;
import com.besysoft.bootcampspringboot.dto.OrdenTrabajoResponse;
import com.besysoft.bootcampspringboot.service.interfaces.IOrdenTrabajoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "Controlador de Orden de Trabajo", tags = "Acciones permitidas para la entidad OrdenTrabajo")
@RestController
@RequestMapping("/ordenes-de-trabajo")
public class OrdenTrabajoController {

    @Autowired
    IOrdenTrabajoService ordenTrabajoService;

    @PostMapping
    @ApiOperation(value = "Generar una Orden de Trabajo")
    public ResponseEntity<OrdenTrabajoResponse> generar(@Valid @RequestBody OrdenTrabajoRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenTrabajoService.crearNuevaOrden(request));
    }

    @PatchMapping("/{id}")
    @ApiOperation(value = "Hace la entrega del Vehículo")
    public ResponseEntity<OrdenTrabajoResponse> entregarVehiculo(@PathVariable Long id){
        return ResponseEntity.ok(ordenTrabajoService.entregarVehiculo(id));
    }
}
