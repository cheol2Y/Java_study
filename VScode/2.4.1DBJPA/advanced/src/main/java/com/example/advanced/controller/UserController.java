package com.example.advanced.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.advanced.model.dto.UserDto;
import com.example.advanced.model.entity.UserEntity;
import com.example.advanced.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto);
    }
    
    @GetMapping("/find/{userName}")
    public UserEntity findUser(@PathVariable String userName) {
        return userService.findByUserName(userName)
                .orElseThrow(() -> new RuntimeException("User not found with username: " + userName));
    }

    @PutMapping("/update/{userName}")
    public UserEntity updateUser(@PathVariable String userName, @RequestBody UserDto updatedUserDto) {
        return userService.updateUser(userName, updatedUserDto);
    }

    @DeleteMapping("/delete/{userName}")
    public void deleteUser(@PathVariable String userName) {
        userService.deleteUser(userName);
    }
    // 기타 사용자 요청에 따른 메서드 추가
}
