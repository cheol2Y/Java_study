package com.example.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.basic.model.dto.BlogDto;
import com.example.basic.model.repository.BlogMapper;

@Service
public class BlogService {

  @Autowired
  private BlogMapper blogMapper;

  public List<BlogDto> selectAll(){
    return blogMapper.selectAll();
  }
  
  public List<BlogDto> selectBlog(BlogDto dto){
    return blogMapper.selectBlog(dto);
  }

  public void insertBlog(BlogDto dto){
    blogMapper.insertBlog(dto);
  }

  public void updateBlog(BlogDto dto){
    blogMapper.updateBlog(dto);
  }

  public void deleteBlog(int blogNum){
    blogMapper.deleteBlog(blogNum);
  }
  
}
