package com.example.advance2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.advance2.database.repository.TodoRepository;
import com.example.advance2.model.dto.TodoDto;
import com.example.advance2.model.entity.TodoEntity;

@Service
public class TodoService {

  private final TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  /**
   * TodoEntity 생성 메서드
   * @param todoDto 생성할 TodoEntity의 정보를 담은 DTO
   * @return 생성된 TodoEntity
   */
  public TodoEntity createTodo(TodoDto todoDto) {
    TodoEntity todoEntity = new TodoEntity();
    todoEntity.setTitle(todoDto.getTitle());
    todoEntity.setStatus(todoDto.isStatus());
    return todoRepository.save(todoEntity);
  }
  
  /**
   * 모든 TodoEntity 조회 메서드
   * @return 모든 TodoEntity의 리스트
   */
  public List<TodoEntity> getAllTodos(){
    return todoRepository.findAll();
  }

  /**
   * ID로 TodoEntity 조회 메서드
   * @param id 조회할 TodoEntity의 ID
   * @return 조회된 TodoEntity, 없을 경우 null
   */
  public TodoEntity getTodoById(Long id){
    Optional<TodoEntity> todoOptional = todoRepository.findById(id);
    return todoOptional.orElse(null);
  }
  
  /**
   * TodoEntity 상태 업데이트 메서드
   * @param id 업데이트할 TodoEntity의 ID
   * @return 업데이트된 TodoEntity, 없을 경우 null
   */
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

  /**
   * TodoEntity 삭제 메서드
   * @param id 삭제할 TodoEntity의 ID
   */
  public void deleteTodo(Long id) {
    todoRepository.deleteById(id);
  }
}
