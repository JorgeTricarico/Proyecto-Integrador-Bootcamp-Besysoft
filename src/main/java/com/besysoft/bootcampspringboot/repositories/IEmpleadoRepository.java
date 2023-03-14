package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {
}
