package com.example.basic.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.basic.model.dto.TodoDto;
import com.example.basic.model.entity.TodoEntity;
import com.example.basic.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String getTodoList(Model model) {
        List<TodoEntity> todos = todoService.getAllTodos();
        model.addAttribute("todos", todos);

        return "todo";
    }

    @PostMapping("/save")
    public String createTodo(@ModelAttribute TodoDto todoDto, Model model) {
      if (isValidInput(todoDto)) {
          todoService.createTodo(todoDto);
          return "redirect:/todo/";
      } else {
          model.addAttribute("errorMessage", "입력이 유효하지 않습니다. 제목을 입력해주세요.");
          return "todo";
      }
  }

  private boolean isValidInput(TodoDto todoDto) {
    return todoDto != null && todoDto.getTitle() != null && !todoDto.getTitle().isEmpty();
}

    @GetMapping("/finished/{id}")
    public String updateTodo(@PathVariable Long id) {
        todoService.updateTodo(id);
        return "redirect:/todo/";
    }


    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return "redirect:/todo/";
    }

}

