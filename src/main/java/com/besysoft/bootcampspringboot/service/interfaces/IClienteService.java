package com.besysoft.bootcampspringboot.service.interfaces;

import com.besysoft.bootcampspringboot.dto.ClienteRequest;
import com.besysoft.bootcampspringboot.dto.VehiculoRequest;

import java.util.List;

public interface IClienteService {

    List<Object> recibirClienteVehiculo(ClienteRequest clienteRequest, VehiculoRequest vehiculoRequest);
}
