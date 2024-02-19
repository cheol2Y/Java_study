package com.example.security2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CommonRestAdvice {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Map<String, Object>> defaultExceptionHandler(Exception e) {
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorMap.put("error", "Internal Server Error");
        errorMap.put("message", e.getMessage());
        return new ResponseEntity<>(errorMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
