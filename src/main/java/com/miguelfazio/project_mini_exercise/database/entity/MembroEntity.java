package com.miguelfazio.project_mini_exercise.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "membro")
public class MembroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "VARCHAR(80)", nullable = false)
    private String nome;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String endereco;

@Column(columnDefinition = "VARCHAR(12)", nullable = false)
    private String telefone;
}
