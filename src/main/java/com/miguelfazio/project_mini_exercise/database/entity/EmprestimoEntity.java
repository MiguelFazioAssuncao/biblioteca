package com.miguelfazio.project_mini_exercise.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "emprestimo")
public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_livro")
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "id_membro")
    private MembroEntity membro;

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate dataEmprestimo;

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate dataDevolucao;
}
