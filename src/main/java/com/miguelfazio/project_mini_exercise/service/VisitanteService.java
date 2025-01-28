package com.miguelfazio.project_mini_exercise.service;

import com.miguelfazio.project_mini_exercise.database.entity.VisitanteEntity;
import com.miguelfazio.project_mini_exercise.database.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitanteService extends GenericServiceImpl<VisitanteEntity, VisitanteEntity, VisitanteRepository> implements GenericService<VisitanteEntity, VisitanteEntity> {
    public VisitanteService(VisitanteRepository repository) {
        super(repository);
    }

    @Override
    public VisitanteEntity equalProperties(VisitanteEntity entity, VisitanteEntity data) {
        if (data.getNome() != null) {
            entity.setNome(data.getNome());
        }

        if (data.getTelefone() != null) {
            entity.setTelefone(data.getTelefone());
        }

        return entity;
    }

    @Override
    public VisitanteEntity newEntity() {
        return new VisitanteEntity();
    }
}
