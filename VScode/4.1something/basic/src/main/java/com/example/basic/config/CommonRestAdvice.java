package com.example.basic.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class CommonRestAdvice {

  @ExceptionHandler(value = Exception.class)
  public ResponseEntity<Map<String, Object>> defaultExceptionHandler(Exception e){
    log.info("start");
    log.info("exception message" + e.getMessage());

    HttpHeaders headers = new HttpHeaders();
    HttpStatus status = HttpStatus.BAD_REQUEST;

    Map<String, Object> error_msg = new HashMap<>();
    error_msg.put("message", "오류 발생 다시 시도해");
    error_msg.put("exception message", e.getMessage());

    return new ResponseEntity<>(error_msg, headers, status);
  }
}

