package com.miguelfazio.project_mini_exercise.service;

import com.miguelfazio.project_mini_exercise.database.entity.EmprestimoEntity;
import com.miguelfazio.project_mini_exercise.database.entity.LivroEntity;
import com.miguelfazio.project_mini_exercise.database.entity.MembroEntity;
import com.miguelfazio.project_mini_exercise.database.repository.EmprestimoRepository;
import com.miguelfazio.project_mini_exercise.database.repository.LivroRepository;
import com.miguelfazio.project_mini_exercise.database.repository.MembroRepository;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService extends GenericServiceImpl<EmprestimoEntity, EmprestimoEntity, EmprestimoRepository> implements GenericService<EmprestimoEntity, EmprestimoEntity> {

    private final MembroRepository membroRepository;
    private final LivroRepository livroRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository, MembroRepository membroRepository, LivroRepository livroRepository) {
        super(emprestimoRepository);
        this.membroRepository = membroRepository;
        this.livroRepository = livroRepository;
    }

    @Override
    public EmprestimoEntity equalProperties(EmprestimoEntity entity, EmprestimoEntity data) {

        LivroEntity livro = livroRepository.findById(data.getLivro().getId())
                .orElseThrow(() -> new RuntimeException("Livro nao encontrado"));
        entity.setLivro(livro);

        MembroEntity membro = membroRepository.findById(data.getMembro().getId())
                .orElseThrow(() -> new RuntimeException("Membro nao encontrado"));

        if (data.getDataEmprestimo() != null) {
            entity.setDataEmprestimo(data.getDataEmprestimo());
        }
        if (data.getDataDevolucao() != null) {
            entity.setDataDevolucao(data.getDataDevolucao());
        }
        return entity;
    }

    @Override
    public EmprestimoEntity newEntity() {
        return new EmprestimoEntity();
    }

    @Override
    public boolean exists(EmprestimoEntity entity) {
        return false;
    }
}
