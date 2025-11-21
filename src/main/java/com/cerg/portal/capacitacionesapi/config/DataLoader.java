package com.cerg.portal.capacitacionesapi.config;

import com.cerg.portal.capacitacionesapi.entity.Curso;
import com.cerg.portal.capacitacionesapi.entity.Usuario;
import com.cerg.portal.capacitacionesapi.repository.CursoRepository;
import com.cerg.portal.capacitacionesapi.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initData(UsuarioRepository usuarioRepo, CursoRepository cursoRepo) {
        return args -> {

            if (usuarioRepo.count() == 0) {
                Usuario u = new Usuario();
                u.setUserName("admin");
                u.setPassword("123456");
                usuarioRepo.save(u);
            }

            if (cursoRepo.count() == 0) {
                cursoRepo.save(new Curso(null, "Angular Básico", "Frontend", "Curso introductorio fundmentos basicos", null));
                cursoRepo.save(new Curso(null, "Spring Boot API", "APIs RESTFul", "Aprende a crear una API", null));
                cursoRepo.save(new Curso(null, "AWS Fundamentos", "Cloud", "Conceptos Cloud", null));
                cursoRepo.save(new Curso(null, "SQL Avanzado", "Base de Datos", "Queries avanzados", null));
            }
        };
    }
}
