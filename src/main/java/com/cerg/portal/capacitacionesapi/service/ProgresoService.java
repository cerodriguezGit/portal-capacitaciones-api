package com.cerg.portal.capacitacionesapi.service;

import com.cerg.portal.capacitacionesapi.entity.Progreso;

import java.util.List;

public interface ProgresoService {

    Progreso iniciar(Long userId, Long cursoId);

    Progreso completar(Long userId, Long cursoId);

    List<Progreso> listarPorUsuario(Long userId);
}
