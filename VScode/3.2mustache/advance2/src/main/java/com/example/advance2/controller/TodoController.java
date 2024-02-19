package com.example.advance2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.advance2.model.dto.TodoDto;
import com.example.advance2.model.entity.TodoEntity;
import com.example.advance2.service.TodoService;

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
    public String createTodo(@ModelAttribute TodoDto todoDto) {
        todoService.createTodo(todoDto);
        return "redirect:/todo/";
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
