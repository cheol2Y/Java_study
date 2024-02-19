package com.example.basic.model.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlogDto {
  private int blogNum;
  private String blogTitle;
  private String blogTag;
  private String blogContent;
  private Timestamp blogDT;

}
