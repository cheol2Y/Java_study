package com.example.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.model.dto.BlogDto;
import com.example.basic.service.BlogService;

@RestController
@RequestMapping("/blog")
public class BlogController {

  @Autowired
  private BlogService blogService;

  @GetMapping("/all")
  public List<BlogDto> selectAll(){
    return blogService.selectAll();
  }
  @GetMapping("/select")
  public List<BlogDto> selectBlog(@ModelAttribute BlogDto dto){
    return blogService.selectBlog(dto);
  }
  
  @PostMapping("/insert")
  public String insertBlog(@RequestBody BlogDto dto) {
    blogService.insertBlog(dto);
    return "저장 성공";
  }

  @PostMapping("/update")
  public String updateBlog(@RequestBody BlogDto dto) {
    blogService.updateBlog(dto);
    return "수정 성공";
  }

      // localhost:8080/ver1/product/delete/7
    @GetMapping("/delete/{blogNum}")
    public String deleteBlog(@PathVariable int blogNum) {
        blogService.deleteBlog(blogNum);
        return "삭제 성공";
    }

  }


  
