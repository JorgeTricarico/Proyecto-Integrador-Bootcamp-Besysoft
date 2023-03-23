package com.besysoft.bootcampspringboot.service.interfaces;

import com.besysoft.bootcampspringboot.dto.OrdenTrabajoRequest;
import com.besysoft.bootcampspringboot.dto.OrdenTrabajoResponse;

public interface IOrdenTrabajoService {

    OrdenTrabajoResponse crearNuevaOrden(OrdenTrabajoRequest OrdenTrabajoRequest);
    OrdenTrabajoResponse entregarVehiculo(Long id);
}
