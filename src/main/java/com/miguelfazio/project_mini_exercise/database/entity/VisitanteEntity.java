package com.miguelfazio.project_mini_exercise.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "visitante")
public class VisitanteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "VARCHAR(80)", nullable = false)
    private String nome;

    @Column(columnDefinition = "VARCHAR(12)", nullable = false)
    private String telefone;
}
