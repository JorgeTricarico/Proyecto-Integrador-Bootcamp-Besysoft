package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.OrdenTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenTrabajoRepository extends JpaRepository<OrdenTrabajo, Long> {
}
