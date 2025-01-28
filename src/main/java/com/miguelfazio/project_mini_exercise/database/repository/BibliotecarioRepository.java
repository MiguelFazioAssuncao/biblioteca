package com.miguelfazio.project_mini_exercise.database.repository;

import com.miguelfazio.project_mini_exercise.database.entity.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
