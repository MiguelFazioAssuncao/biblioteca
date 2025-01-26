package com.miguelfazio.project_mini_exercise.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "livro")
public class LivroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String titulo;

    @Column(columnDefinition = "VARCHAR(80)")
    private String autor;

    @Column(columnDefinition = "INT")
    private int anoPublicacao;

}
