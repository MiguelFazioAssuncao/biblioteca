package com.miguelfazio.project_mini_exercise.service;

import com.miguelfazio.project_mini_exercise.database.entity.LivroEntity;
import com.miguelfazio.project_mini_exercise.database.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService extends GenericServiceImpl<LivroEntity, LivroEntity, LivroRepository> implements GenericService<LivroEntity, LivroEntity> {
    public LivroService(LivroRepository livroRepository) {
        super(livroRepository);
    }

    @Override
    public LivroEntity equalProperties(LivroEntity entity, LivroEntity data) {
        if (data.getTitulo() != null) {
            entity.setTitulo(data.getTitulo());
        }

        if (data.getAutor() != null) {
            entity.setAutor(data.getAutor());
        }

        if (data.getAnoPublicacao() != 0) {
            entity.setAnoPublicacao(data.getAnoPublicacao());
        }

        return entity;
    }

    @Override
    public  LivroEntity newEntity() {
        return new LivroEntity();
    }

    @Override
    public boolean exists(LivroEntity entity) {
        return false;
    }
}
