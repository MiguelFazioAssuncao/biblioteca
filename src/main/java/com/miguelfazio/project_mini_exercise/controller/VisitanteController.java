package com.miguelfazio.project_mini_exercise.controller;

import com.miguelfazio.project_mini_exercise.database.entity.VisitanteEntity;
import com.miguelfazio.project_mini_exercise.service.VisitanteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController extends GenericController<VisitanteEntity, VisitanteEntity, VisitanteService>{
    public VisitanteController(VisitanteService service) {
        super(service);
    }
}
