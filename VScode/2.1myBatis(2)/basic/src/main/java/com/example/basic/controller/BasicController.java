package com.example.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/ver1/basic")
public class BasicController {
  
  @GetMapping("/hello")
  public String hello(){

    log.info("서버구동 확인용입니다.");
    return "정상구동";
  }
  
  
}
