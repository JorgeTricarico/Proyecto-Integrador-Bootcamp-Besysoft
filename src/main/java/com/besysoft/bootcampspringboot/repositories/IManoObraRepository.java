package com.besysoft.bootcampspringboot.repositories;

import com.besysoft.bootcampspringboot.dominio.ManoObra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IManoObraRepository extends JpaRepository<ManoObra, Long> {
}
