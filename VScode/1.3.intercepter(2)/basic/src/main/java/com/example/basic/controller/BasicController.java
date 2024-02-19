package com.example.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BasicController {
  
  @GetMapping("/hello")
  public String hello(){

    log.info("BasicController에서 hello 실행");
    return "hello";
  }

  
  @GetMapping("/query")
  public String getQuery(@RequestParam String key){
    log.info("BasicController에서 getQuery 실행");
    return key;
  }

  
}
