package com.cerg.portal.capacitacionesapi.service;

import com.cerg.portal.capacitacionesapi.entity.Usuario;
import com.cerg.portal.capacitacionesapi.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario login(String username, String password) {
        return usuarioRepository.findByUserName(username)
                .filter(u -> u.getPassword().equals(password))
                .orElseThrow(() -> new RuntimeException("Credenciales invalidas"));
    }
}
