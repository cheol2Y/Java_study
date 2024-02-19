package com.example.advance.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.advance.model.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
  
}
