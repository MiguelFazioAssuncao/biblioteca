package com.miguelfazio.project_mini_exercise.controller;

import com.miguelfazio.project_mini_exercise.service.GenericService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<E, DTO, S extends GenericService<E, DTO>> {

   private final S service;

   public GenericController(S service) {
       this.service = service;
   }

    @GetMapping("/{id}")
    public ResponseEntity<E> getById(@PathVariable Long id) {
        E entity = service.get(id);
        return entity != null ? ResponseEntity.ok(entity) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<E>> getAll() {
       List<E> entities = service.getAll();
       return ResponseEntity.ok(entities);
    }

    @PostMapping
    public ResponseEntity<E> create(@RequestBody DTO entity) {
       try {
           E createdEntity = service.create(entity);
           return ResponseEntity.status(201).body(createdEntity);
       } catch (Exception e) {
           return ResponseEntity.status(400).build();
       }
   }

    @PutMapping("/{id}")
    public ResponseEntity<E> update(@PathVariable Long id, @RequestBody DTO entity) {
       E updatedEntity = service.alter(id, entity);
       return updatedEntity != null ? ResponseEntity.ok(updatedEntity) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
       try {
           service.delete(id);
           return ResponseEntity.noContent().build();
       } catch (Exception e) {
           return ResponseEntity.status(400).build();
       }
    }
}
