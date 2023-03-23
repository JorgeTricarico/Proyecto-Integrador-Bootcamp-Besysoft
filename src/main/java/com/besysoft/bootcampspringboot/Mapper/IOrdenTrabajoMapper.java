package com.besysoft.bootcampspringboot.Mapper;

import com.besysoft.bootcampspringboot.dominio.OrdenTrabajo;
import com.besysoft.bootcampspringboot.dto.OrdenTrabajoRequest;
import com.besysoft.bootcampspringboot.dto.OrdenTrabajoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface IOrdenTrabajoMapper {

    @Mappings({
            @Mapping(target = "fechaIngreso", expression = "java(getFechaDeIngreso())"),
            @Mapping(target = "estado", expression = "java(getEstadoCreado())"),
    })
    OrdenTrabajo mapToEntity(OrdenTrabajoRequest dto);

    @Mapping(target = "fechaDeIngreso", dateFormat = "yyyy-MM-dd")
    OrdenTrabajoResponse mapToDto(OrdenTrabajo ordenDeTrabajo);

    default LocalDateTime getFechaDeIngreso(){
        return LocalDateTime.now();
    }

    default String getEstadoCreado(){
        return "Creada";
    }

}
