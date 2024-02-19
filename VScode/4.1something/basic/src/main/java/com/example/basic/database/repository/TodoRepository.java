package com.example.basic.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.model.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

} 


// 