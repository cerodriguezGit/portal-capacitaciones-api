package com.cerg.portal.capacitacionesapi.controller;

import com.cerg.portal.capacitacionesapi.entity.Usuario;
import com.cerg.portal.capacitacionesapi.service.AuthService;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para gestionar la autenticación de usuarios.
 * Expone endpoints API para el login.
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://portal-capacitaciones-web.onrender.com"})
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * Realiza el envio de las credenciales de acceso
     * @param body
     * @return login valido o invalido
     */
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario body) {
        return authService.login(body.getUserName(), body.getPassword());
    }
}
