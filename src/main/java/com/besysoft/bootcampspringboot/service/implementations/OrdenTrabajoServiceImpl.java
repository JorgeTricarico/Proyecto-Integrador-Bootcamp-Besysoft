package com.besysoft.bootcampspringboot.service.implementations;

import com.besysoft.bootcampspringboot.Mapper.IOrdenTrabajoMapper;
import com.besysoft.bootcampspringboot.dominio.OrdenTrabajo;
import com.besysoft.bootcampspringboot.dto.OrdenTrabajoRequest;
import com.besysoft.bootcampspringboot.dto.OrdenTrabajoResponse;
import com.besysoft.bootcampspringboot.exception.InvalidValueException;
import com.besysoft.bootcampspringboot.exception.OrdenTrabajoException;
import com.besysoft.bootcampspringboot.repositories.IOrdenTrabajoRepository;
import com.besysoft.bootcampspringboot.service.interfaces.IOrdenTrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
//@ConditionalOnProperty(prefix = "app", name = "type-data", havingValue = "database")
public class OrdenTrabajoServiceImpl implements IOrdenTrabajoService {

    @Autowired
    IOrdenTrabajoMapper ordenTrabajoMapper;
    @Autowired
    IOrdenTrabajoRepository ordenTrabajoRepository;

    @Override
    @Transactional(readOnly = false)
    public OrdenTrabajoResponse crearNuevaOrden(OrdenTrabajoRequest OrdenTrabajoRequest) {
        OrdenTrabajo ordenTrabajo = ordenTrabajoMapper.mapToEntity(OrdenTrabajoRequest);
        return ordenTrabajoMapper.mapToDto(ordenTrabajoRepository.save(ordenTrabajo));
    }

    @Override
    @Transactional(readOnly = false)
    public OrdenTrabajoResponse entregarVehiculo(Long id) {
        Optional<OrdenTrabajo> optional = this.ordenTrabajoRepository.findById(id);


        OrdenTrabajo ordenTrabajo = optional.
                orElseThrow(() -> new InvalidValueException("No existe orden de trabajo con id "+ id));

        if(!ordenTrabajo.getEstado().equals("Facturado")){
            throw new OrdenTrabajoException("La orden de trabajo aun no fue facturada");
        }

        ordenTrabajo.setEstado("Terminado");

        return ordenTrabajoMapper.mapToDto(ordenTrabajo);
    }
}
