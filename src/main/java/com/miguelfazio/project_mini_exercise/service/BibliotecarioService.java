package com.miguelfazio.project_mini_exercise.service;

import com.miguelfazio.project_mini_exercise.database.entity.BibliotecarioEntity;
import com.miguelfazio.project_mini_exercise.database.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService extends GenericServiceImpl<BibliotecarioEntity, BibliotecarioEntity, BibliotecarioRepository> implements GenericService<BibliotecarioEntity, BibliotecarioEntity> {

    public BibliotecarioService(BibliotecarioRepository repository) {
        super(repository);
    }

    @Override
    public BibliotecarioEntity equalProperties(BibliotecarioEntity entity, BibliotecarioEntity data) {
        if (data.getNome() != null) {
            entity.setNome(data.getNome());
        }
        if (data.getEmail() != null) {
            entity.setEmail(data.getEmail());
        }
        if (data.getSenha() != null) {
            entity.setSenha(data.getSenha());
        }
        return entity;
    }

    @Override
    public BibliotecarioEntity newEntity() {
        return new BibliotecarioEntity();
    }

    @Override
    public boolean exists(BibliotecarioEntity entity) {
        return false;
    }

}
