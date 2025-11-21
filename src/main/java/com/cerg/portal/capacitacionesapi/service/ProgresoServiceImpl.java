package com.cerg.portal.capacitacionesapi.service;

import com.cerg.portal.capacitacionesapi.entity.Progreso;
import com.cerg.portal.capacitacionesapi.repository.ProgresoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgresoServiceImpl implements ProgresoService {

    private final ProgresoRepository progresoRepository;

    public ProgresoServiceImpl(ProgresoRepository progresoRepository) {
        this.progresoRepository = progresoRepository;
    }

    public Progreso iniciar(Long userId, Long cursoId) {
        Progreso p = progresoRepository
                .findByUsuarioIdAndCursoId(userId, cursoId)
                .orElse(new Progreso());

        p.setUsuarioId(userId);
        p.setCursoId(cursoId);
        p.setEstado("iniciado");

        return progresoRepository.save(p);
    }

    public Progreso completar(Long userId, Long cursoId) {
        Progreso p = progresoRepository
                .findByUsuarioIdAndCursoId(userId, cursoId)
                .orElse(new Progreso());

        p.setUsuarioId(userId);
        p.setCursoId(cursoId);
        p.setEstado("completado");

        return progresoRepository.save(p);
    }

    public List<Progreso> listarPorUsuario(Long userId) {
        return progresoRepository.findByusuarioId(userId);
    }
}
