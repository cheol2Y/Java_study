package com.example.basic.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.model.UserDto;

@RestController
public class BasicController{

  @GetMapping("/hello")
  public String getHello(){

      return "Hello World";
  }

  @PostMapping("/variable1")
  public String postVariable1(@RequestBody Map<String, Object> params){
    String msg ="";
    for(String key:params.keySet()){
      msg += (String)params.get(key);
    }

    return msg;
  }

  @RequestMapping(value="/dto1", method = RequestMethod.POST)
  public String pstDto1(@RequestBody UserDto dto){

    return dto.toString();

  }
  
}
  

