package com.example.basic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ApiController {
    
    @GetMapping("/index")
    public Map<String, Object> index() {

        Map<String, Object> map = new HashMap<>();
        map.put("msg", "Spring에서 왔다");
        return map;
    }
}
