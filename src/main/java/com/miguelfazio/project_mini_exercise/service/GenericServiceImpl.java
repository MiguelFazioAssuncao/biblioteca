package com.miguelfazio.project_mini_exercise.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Data
@RequiredArgsConstructor
@Slf4j
public abstract class GenericServiceImpl<E, DTO, R extends JpaRepository<E, Long>> implements GenericService<E, DTO> {

    private final R repository;

    public E get(Long id) {
        log.info("Buscando entidade com o ID: {}", id);
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entidade não encontrada com o ID: " + id));
    }

    public List<E> getAll() {
        log.info("Buscando entidades dentro do repositório");
        return repository.findAll();
    }

    public E create(DTO entity) {
        log.info("Criando uma nova entidade");
        E entitySave = equalProperties(newEntity(), entity);
        return repository.save(entitySave);
    }

    public E alter(Long id, DTO data) {
        log.info("Alterando entidade com o ID: {}", id);
        E entityFound = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entidade não encontrada com o ID: " + id));
        return repository.save(equalProperties(entityFound, data));
    }

    public void delete(Long id) {
        log.info("Deletando entidade com o ID: {}", id);
        E entity = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entidade não encontrada com o ID: " + id));
        repository.delete(entity);
    }

    public abstract E equalProperties(E entity, DTO data);
    public abstract E newEntity();
}
