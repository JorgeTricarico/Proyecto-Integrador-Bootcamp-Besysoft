package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.DetalleOrdenTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleOrdenTrabajoRepository extends JpaRepository<DetalleOrdenTrabajo, Long> {
}
