package com.miguelfazio.project_mini_exercise.controller;

import com.miguelfazio.project_mini_exercise.database.entity.LivroEntity;
import com.miguelfazio.project_mini_exercise.service.LivroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController extends GenericController<LivroEntity, LivroEntity, LivroService> {

    public LivroController(LivroService service) {
        super(service);
    }

}
