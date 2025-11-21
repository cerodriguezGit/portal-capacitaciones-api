package com.cerg.portal.capacitacionesapi.repository;

import com.cerg.portal.capacitacionesapi.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
