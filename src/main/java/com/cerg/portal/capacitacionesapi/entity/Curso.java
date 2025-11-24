package com.cerg.portal.capacitacionesapi.entity;

import com.cerg.portal.capacitacionesapi.model.Enum.EnumEstado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String modulo;

    private String descripcion;

    @Enumerated(EnumType.STRING)
    private EnumEstado estado;
}
