package com.cerg.portal.capacitacionesapi.service;

import com.cerg.portal.capacitacionesapi.entity.Curso;

import java.util.List;

public interface CursoService {

    Curso guardarCurso(Curso curso);

    List<Curso> listarCursos();

    Curso obtenerCursoId(Long id);

    Curso actualizarCurso(Long id, Curso curso);
}
