package com.cerg.portal.capacitacionesapi.repository;

import com.cerg.portal.capacitacionesapi.entity.Progreso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProgresoRepository extends JpaRepository<Progreso, Long> {
    List<Progreso> findByusuarioId(Long usuarioId);

    Optional<Progreso> findByUsuarioIdAndCursoId(Long usuarioId, Long cursoId);
}
