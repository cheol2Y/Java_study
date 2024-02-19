package com.example.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

  @GetMapping("/hello")
  public String getHello(){
    String msg = "하이";

    return msg;
  }
  
}
