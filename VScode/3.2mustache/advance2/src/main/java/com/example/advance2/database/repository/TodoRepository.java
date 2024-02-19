package com.example.advance2.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.advance2.model.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
  
}
