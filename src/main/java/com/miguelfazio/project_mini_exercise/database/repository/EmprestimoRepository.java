package com.miguelfazio.project_mini_exercise.database.repository;

import com.miguelfazio.project_mini_exercise.database.entity.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {
}
