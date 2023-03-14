package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.Repuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepuestoRepository extends JpaRepository<Repuesto, Long> {
}
