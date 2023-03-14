package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.Mecanico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMecanicoRepository extends JpaRepository<Mecanico, Long> {
}
