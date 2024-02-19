package com.example.basic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.basic.database.repository.TodoRepository;
import com.example.basic.model.dto.TodoDto;
import com.example.basic.model.entity.TodoEntity;


@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity createTodo(TodoDto todoDto) {
        // TODO: 새로운 TodoEntity를 생성하고 저장하는 코드를 작성하세요.

        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setTitle(todoDto.getTitle());
        todoEntity.setDueDate(todoDto.getDueDate());
        todoEntity.setStatus(todoDto.isStatus());
        return todoRepository.save(todoEntity);
    }

    public List<TodoEntity> getAllTodos() {
        // TODO: 모든 TodoEntity를 가져오는 코드를 작성하세요.
        return todoRepository.findAll();
    }

    public TodoEntity getTodoById(Long id) {
        // TODO: 주어진 id에 해당하는 TodoEntity를 가져오는 코드를 작성하세요.
        Optional<TodoEntity> todoOptional = todoRepository.findById(id);
        return todoOptional.orElse(null);
    }

    public TodoEntity updateTodo(Long id) {
        // TODO: 주어진 id에 해당하는 TodoEntity의 상태를 변경하고 저장하는 코드를 작성하세요.
        Optional<TodoEntity> todoOptional = todoRepository.findById(id);
        if (todoOptional.isPresent()){
          TodoEntity todo = todoOptional.get();
          boolean newStatus = !todo.isStatus();
          todo.setStatus(newStatus);
          todoRepository.save(todo);
          return todo;
        } else {
          return null;
        }

    }

    public void deleteTodo(Long id) {
        // TODO: 주어진 id에 해당하는 TodoEntity를 삭제하는 코드를 작성하세요.
        todoRepository.deleteById(id);
    }

    // TODO: 기타 필요한 메서드 추가

}
