package com.miguelfazio.project_mini_exercise.controller;

import com.miguelfazio.project_mini_exercise.service.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<E, DTO, S extends GenericService<E, DTO>> {

   private final S service;

   public GenericController(S service) {
       this.service = service;
   }

    @GetMapping("/{id}")
    public E getById(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<E> getAll() {
       return service.getAll();
    }

    @PostMapping
    public E create(@RequestBody DTO entity) {
       return service.create(entity);
    }

    @PutMapping("/{id}")
    public E update(@PathVariable Long id, @RequestBody DTO entity) {
       return service.alter(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
       service.delete(id);
    }
}
