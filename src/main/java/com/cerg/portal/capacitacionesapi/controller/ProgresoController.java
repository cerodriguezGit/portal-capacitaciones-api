package com.cerg.portal.capacitacionesapi.controller;

import com.cerg.portal.capacitacionesapi.entity.Progreso;
import com.cerg.portal.capacitacionesapi.service.ProgresoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar las operaciones relacionadas con el progreso de los cursos.
 * Expone endpoints API para iniciar, completar y listar el progreso de los cursos.
 */
@RestController
@RequestMapping("/api/v1/progreso")
@CrossOrigin(origins = "*")
public class ProgresoController {

    private final ProgresoService progresoService;

    public ProgresoController(ProgresoService progresoService) {
        this.progresoService = progresoService;
    }

    /**
     * Recibe los parametros para dar inicio al curso
     * @param userId
     * @param cursoId
     * @return el progreso del curso como iniciado
     */
    @PostMapping("/iniciar")
    public Progreso iniciar(@RequestParam Long userId, @RequestParam Long cursoId) {
        return progresoService.iniciar(userId, cursoId);
    }

    /**
     * Recibe los parametros para asignar como completado el curso.
     * @param userId
     * @param cursoId
     * @return el progreso del curso
     */
    @PostMapping("/completar")
    public Progreso completar(@RequestParam Long userId, @RequestParam Long cursoId) {
        return progresoService.completar(userId, cursoId);
    }

    /**
     *
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public List<Progreso> listar(@PathVariable Long userId) {
        return progresoService.listarPorUsuario(userId);
    }
}
