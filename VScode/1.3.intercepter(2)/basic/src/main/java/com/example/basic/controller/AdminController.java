package com.example.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {
  
  @GetMapping("/hello")
  public String hello(){

    log.info("여긴 admin의 hello인디?");
    return "ADmin의 Hello 다";
  }

  // localhost:8080/admin/world
  @GetMapping("/world")
  public String world(){

    log.info("여긴 admin의 world인디?");
    return "admin의 world를 출력";
  }
}
