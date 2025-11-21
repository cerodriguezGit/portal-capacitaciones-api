package com.cerg.portal.capacitacionesapi.service;

import com.cerg.portal.capacitacionesapi.entity.Usuario;

public interface AuthService {

    Usuario login(String username, String password);
}
