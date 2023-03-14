package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
