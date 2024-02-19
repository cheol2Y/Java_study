package com.example.advance.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.advance.model.dto.TodoDto;
import com.example.advance.model.entity.TodoEntity;
import com.example.advance.service.TodoService;

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
        // model.addAttribute("todoDto", new TodoDto()); 

        return "todo";
    }

    @PostMapping("/save")
    public String createTodo(@ModelAttribute TodoDto todoDto) {
        todoService.createTodo(todoDto);
        return "redirect:/todo/";
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<TodoEntity> getTodoById(@PathVariable Long id) {
    //     TodoEntity todo = todoService.getTodoById(id);
    //     return new ResponseEntity<>(todo, HttpStatus.OK);
    // }

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





// package com.example.advance.controller;

// import java.util.List;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;

// import com.example.advance.model.dto.TodoDto;
// import com.example.advance.model.entity.TodoEntity;
// import com.example.advance.service.TodoService;

// @Controller
// @RequestMapping("/ver1/todo")
// public class TodoController {

//     private final TodoService todoService;

    
//     public TodoController(TodoService todoService) {
//         this.todoService = todoService;
//     }

//     @PostMapping
//     public ResponseEntity<TodoEntity> createTodo(@RequestBody TodoDto todoDto) {
//         TodoEntity createdTodo = todoService.createTodo(todoDto);
//         return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
//     }

//     @GetMapping
//     public ResponseEntity<List<TodoEntity>> getAllTodos() {
//         List<TodoEntity> todos = todoService.getAllTodos();
//         return new ResponseEntity<>(todos, HttpStatus.OK);
//     }

//     @GetMapping("/{id}")
//     public ResponseEntity<TodoEntity> getTodoById(@PathVariable Long id) {
//         TodoEntity todo = todoService.getTodoById(id);
//         return new ResponseEntity<>(todo, HttpStatus.OK);
//     }

//     @PutMapping("/{id}")
//     public ResponseEntity<TodoEntity> updateTodo(@PathVariable Long id, @RequestBody TodoDto todoDto) {
//         TodoEntity updatedTodo = todoService.updateTodo(id, todoDto);
//         return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
//         todoService.deleteTodo(id);
//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//     }



// }