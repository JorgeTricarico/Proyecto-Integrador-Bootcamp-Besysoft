package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {
    Optional<Vehiculo> findVehiculoByPatente(String patente);
}
