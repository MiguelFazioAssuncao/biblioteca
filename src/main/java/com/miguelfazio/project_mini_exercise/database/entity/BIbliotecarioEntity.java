package com.miguelfazio.project_mini_exercise.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bibliotecario")
public class BIbliotecarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "VARCHAR(80)", nullable = false)
    private String nome;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String email;

    @Column(columnDefinition = "VARCHAR(55)", nullable = false)
    private String senha;
}
