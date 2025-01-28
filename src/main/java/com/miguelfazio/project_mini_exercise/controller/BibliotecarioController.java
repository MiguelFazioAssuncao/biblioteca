package com.miguelfazio.project_mini_exercise.controller;

import com.miguelfazio.project_mini_exercise.database.entity.BibliotecarioEntity;
import com.miguelfazio.project_mini_exercise.service.BibliotecarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bibliotecarios")
public class BibliotecarioController extends GenericController<BibliotecarioEntity, BibliotecarioEntity, BibliotecarioService>{
    public BibliotecarioController(BibliotecarioService service) {
        super(service);
    }
}
