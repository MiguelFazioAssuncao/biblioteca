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
       return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<E> create(@RequestBody DTO entity) {
        E createdEntity = service.create(entity);
        return ResponseEntity.status(201).body(createdEntity);
   }

    @PutMapping("/{id}")
    public ResponseEntity<E> update(@PathVariable Long id, @RequestBody DTO entity) {
       E updatedEntinty = service.alter(id, entity);
       return updatedEntinty != null ? ResponseEntity.ok(updatedEntinty) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
       return ResponseEntity.ok(service.delete(id));
    }
}
