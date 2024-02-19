package com.example.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.basic.model.entity.UserEntity;
import com.example.basic.model.repository.UserMapper;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public List<UserEntity> selectUserAll() {

    List<UserEntity> userList = userMapper.selectUserAll();

    return userList;
  }
  
}