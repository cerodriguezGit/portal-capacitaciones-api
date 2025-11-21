package com.cerg.portal.capacitacionesapi.service;

import com.cerg.portal.capacitacionesapi.entity.Curso;
import com.cerg.portal.capacitacionesapi.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso obtenerCursoId(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
    }

    @Override
    public Curso actualizarCurso(Long id, Curso curso) {
        Curso c = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        c.setTitulo(curso.getTitulo());
        c.setModulo(curso.getModulo());
        c.setDescripcion(curso.getDescripcion());
        c.setUrlImagen(curso.getUrlImagen());

        return cursoRepository.save(c);
    }
}
