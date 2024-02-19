package com.example.basic.model;

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
public class BookDto {
  
  private Long bookId;
  private Boolean isBn;
  private String bookTitle;
  private String author;
  private double price;
  
}
