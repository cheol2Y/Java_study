package com.example.basic.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@NoArgsConstructor@AllArgsConstructor@ToString

public class UserEntity {
  
  private int userId;
  private String userName;
  private int userPopularity;
  private String userSong;

}
