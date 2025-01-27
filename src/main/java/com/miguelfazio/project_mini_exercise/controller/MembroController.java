package com.miguelfazio.project_mini_exercise.controller;

import com.miguelfazio.project_mini_exercise.database.entity.MembroEntity;
import com.miguelfazio.project_mini_exercise.service.MembroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membros")
public class MembroController extends GenericController<MembroEntity, MembroEntity, MembroService> {

    public MembroController(MembroService service) {
        super(service);
    }
}
