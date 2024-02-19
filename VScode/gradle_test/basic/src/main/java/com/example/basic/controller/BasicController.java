package com.example.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
  @GetMapping("/Hii")
  public String getHello(){

    String msg = "해위~";
    return msg;
  }

  
}
