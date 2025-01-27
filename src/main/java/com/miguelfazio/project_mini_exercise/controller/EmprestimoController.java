package com.miguelfazio.project_mini_exercise.controller;

import com.miguelfazio.project_mini_exercise.database.entity.EmprestimoEntity;
import com.miguelfazio.project_mini_exercise.service.EmprestimoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController extends GenericController<EmprestimoEntity, EmprestimoEntity, EmprestimoService> {

    public EmprestimoController(EmprestimoService service) {
        super(service);
    }
}
