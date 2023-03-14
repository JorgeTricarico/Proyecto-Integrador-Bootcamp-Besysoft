package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
