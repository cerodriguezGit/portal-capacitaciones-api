package com.cerg.portal.capacitacionesapi.service;

import com.cerg.portal.capacitacionesapi.entity.Curso;

import java.util.List;

public interface CursoService {

    Curso crear(Curso curso);

    List<Curso> listarCursos();

    Curso obtenerCursoId(Long id);

    Curso editarCurso(Long id, Curso curso);

    Curso actualizarEstado(Long id, String estado);
}
