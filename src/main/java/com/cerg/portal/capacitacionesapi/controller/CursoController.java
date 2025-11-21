package com.cerg.portal.capacitacionesapi.controller;

import com.cerg.portal.capacitacionesapi.entity.Curso;
import com.cerg.portal.capacitacionesapi.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar las operaciones relacionadas con los cursos.
 * Expone endpoints API para crear, listar, obtener y actualizar cursos.
 */
@RestController
@RequestMapping("/api/v1/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    /**
     * Crea un nuevo curso.
     * @param curso El objeto Curso que se va a crear, proporcionado en el cuerpo de la solicitud.
     * @return El curso recién creado.
     */
    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoService.guardarCurso(curso);
    }

    /**
     * Lista todos los cursos disponibles.
     * @return Una lista de todos los cursos.
     */
    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    /**
     * Obtiene un curso específico por su ID.
     * @param id El ID del curso a obtener, extraído de la URL.
     * @return El curso correspondiente al ID especificado.
     */
    @GetMapping("/{id}")
    public Curso obtenerCurso(@PathVariable Long id) {
        return cursoService.obtenerCursoId(id);
    }

    /**
     * Actualiza un curso existente por su ID.
     * @param id    El ID del curso que se va a actualizar, extraído de la URL.
     * @param curso El objeto Curso con la información actualizada, proporcionado en el cuerpo de la solicitud.
     * @return El curso actualizado.
     */
    @PutMapping("/{id}")
    public Curso actualizar(@PathVariable Long id, @RequestBody Curso curso) {
        return cursoService.actualizarCurso(id, curso);
    }
}
