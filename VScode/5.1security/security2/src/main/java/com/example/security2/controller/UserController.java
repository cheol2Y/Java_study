package com.example.security2.controller;

// UserController.java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.security2.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
      this.userService = userService;
    }
    
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              @RequestParam("role") String role) {
        userService.registerUser(username, password, role);
        return "redirect:/login";
    }
}

