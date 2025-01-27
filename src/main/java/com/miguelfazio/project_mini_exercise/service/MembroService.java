package com.miguelfazio.project_mini_exercise.service;

import com.miguelfazio.project_mini_exercise.database.entity.MembroEntity;
import com.miguelfazio.project_mini_exercise.database.repository.MembroRepository;
import org.springframework.stereotype.Service;

@Service
public class MembroService extends GenericServiceImpl<MembroEntity, MembroEntity, MembroRepository> implements GenericService<MembroEntity, MembroEntity> {
    public MembroService(MembroRepository repository) {
        super(repository);
    }

    @Override
    public MembroEntity equalProperties(MembroEntity entity, MembroEntity data) {
        if (data.getNome() != null) {
            entity.setNome(data.getNome());
        }

        if (data.getEndereco() != null) {
            entity.setEndereco(data.getEndereco());
        }

        if (data.getTelefone() != null) {
            entity.setTelefone(data.getTelefone());
        }

        return entity;
    }

    @Override
    public MembroEntity newEntity() {
       return new MembroEntity();
    }
}
