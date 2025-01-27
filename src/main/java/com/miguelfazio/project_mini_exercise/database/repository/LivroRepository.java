package com.miguelfazio.project_mini_exercise.database.repository;

import com.miguelfazio.project_mini_exercise.database.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
}
