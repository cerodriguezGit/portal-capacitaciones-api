package com.cerg.portal.capacitacionesapi.controller;

import com.cerg.portal.capacitacionesapi.entity.Curso;
import com.cerg.portal.capacitacionesapi.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Controlador REST para gestionar las operaciones relacionadas con los cursos.
 * Expone endpoints API para crear, listar, obtener y actualizar cursos.
 */
@RestController
@RequestMapping("/api/v1/cursos")
@CrossOrigin(origins = {"http://localhost:4200", "https://portal-capacitaciones-web.onrender.com"})
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
    public Curso crear(@RequestBody Curso curso) {
        return cursoService.crear(curso);
    }

    /**
     * Lista todos los cursos disponibles.
     * @return Una lista de todos los cursos.
     */
    @GetMapping
    public List<Curso> listar() {
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
     * edita un curso existente por su ID.
     * @param id    El ID del curso que se va a editar, extraído de la URL.
     * @param curso El objeto Curso con la información actualizada, proporcionado en el cuerpo de la solicitud.
     * @return El curso editado.
     */
    @PutMapping("/{id}")
    public Curso modificar(@PathVariable Long id, @RequestBody Curso curso) {
        return cursoService.editarCurso(id, curso);
    }

    /**
     * Actualiza el estado de progreso de un curso
     * @param id
     * @param body
     * @return curso con estado actualizado
     */
    @PatchMapping("/{id}/estado")
    public Curso actualizarEstado(@PathVariable Long id, @RequestBody Map<String, String> body) {
        return cursoService.actualizarEstado(id, body.get("estado"));
    }
}
