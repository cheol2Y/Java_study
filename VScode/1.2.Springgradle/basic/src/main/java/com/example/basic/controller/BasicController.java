package com.example.basic.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.model.BasicDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BasicController {

  @GetMapping("/hello")
  public String getHello(){

    String msg = "Hello Wrold";

    System.out.println("msg: " + msg);
    return msg;
  }

  // Slf4j를 사용하여 log.info를 사용하여 println을 대체한다. 이게 더 효율적이라
  @RequestMapping(value = "hello1",method= RequestMethod.GET)
  public String getHello1(){

    String msg = "Hello 헬로우~";
    log.info(msg);
    
    return msg;
  }

  @GetMapping("/logging")
  public String getLogging(){
  
    log.info("abc:");
  
    log.info("ㅎㅇㅎㅇ");
  
    return "logging 완료";
  }
  
  // 주소에서 param을 입력받아 사용한다
  @GetMapping("variable/{param}")
  public String getHeollo2(@PathVariable String param){
    
    log.info("url로부터 받은"+param);
    return param;
  }


  // 주소에서 param값을 받아서 1,2 에 할당
  @GetMapping("variable2/{param1}/{param2}")
  public String getHeollo3(@PathVariable String param1,@PathVariable String param2){

    log.info("url로부터 받은"+param1);
    return param2;
  }

  // 이렇게하면 param변수를 받아서 name에 넣어줌
  @GetMapping("/variable4/{param4}")
  public String getHeollo4(@PathVariable("param4]") String name){
    
    log.info("url로부터 받은"+name);
    return name;
  }

  // localhost:8080/query?key=value
  // value에 들어간 값이 return된다.
  @GetMapping("/query")
  public String getQuery1(@RequestParam String key){

    log.info("쿼리는 처음인디?");
    return key;
  }

  //http://localhost:8080/query2?key1=value1&key2=value2&key3=value3
  @GetMapping("/query2")
  public String getQuery2(
    @RequestParam String key1, @RequestParam String key2, @RequestParam String key3){

    log.info("이게 쿼리인가");
    return key1+ key2+ key3;
  }
  
  //
  @GetMapping("/query3")
  public String getQuery3(@RequestParam Map<String,Object> params){
    
    log.info("이게 쿼리인가");
    String msg = "";
    for(String key:params.keySet()){
      msg = msg + (String)params.get(key);
    }
    return msg;
  }

  //localhost:8080/dto1?name=name1&email=email1
  @GetMapping("/dto1")

  public String getDto1(@ModelAttribute BasicDto dto){

    return dto.toString();

  }


}
