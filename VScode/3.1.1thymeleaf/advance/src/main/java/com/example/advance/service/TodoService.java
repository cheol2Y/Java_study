package com.example.advance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.advance.database.repository.TodoRepository;
import com.example.advance.model.dto.TodoDto;
import com.example.advance.model.entity.TodoEntity;

@Service
public class TodoService {

  private final TodoRepository todoRepository;

  
  public TodoService(TodoRepository todoRepository) {
      this.todoRepository = todoRepository;
  }

  public TodoEntity createTodo(TodoDto todoDto) {
      TodoEntity todoEntity = new TodoEntity();
      todoEntity.setTitle(todoDto.getTitle());
      todoEntity.setStatus(todoDto.isStatus());
      return todoRepository.save(todoEntity);
  }

  public List<TodoEntity> getAllTodos() {
      return todoRepository.findAll();
  }

  public TodoEntity getTodoById(Long id) {
      Optional<TodoEntity> todoOptional = todoRepository.findById(id);
      return todoOptional.orElse(null);
  }



  public TodoEntity updateTodo(Long id) {
    Optional<TodoEntity> todoOptional = todoRepository.findById(id);
    if (todoOptional.isPresent()) {
      TodoEntity todo = todoOptional.get();
      boolean newStatus = !todo.isStatus(); // 현재 상태의 반대로 변경
      todo.setStatus(newStatus);
      todoRepository.save(todo);
      
      return todo;
    } else {
        return null; // ID에 해당하는 TodoEntity가 없을 경우
    }
  }

  public void deleteTodo(Long id) {
      todoRepository.deleteById(id);
  }
}
