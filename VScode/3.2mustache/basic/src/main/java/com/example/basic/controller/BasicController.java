package com.example.basic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.basic.model.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BasicController {

  @GetMapping("/hello")  
  public String hello(Model model){

    return "hello";
  }
  @GetMapping("/mustache")
  public String mustache(Model model) {

    model.addAttribute("name", "본좌");

    model.addAttribute("age", 37);

    model.addAttribute("company", "<span>주술회전</span>");

    model.addAttribute("person", false);

    return "mustache";
  }
  
  @GetMapping("book")
  public String book(Model model){

    
    BookDto book = new BookDto();
    book.setBookId(1L);
    book.setIsBn(true);
    book.setBookTitle("<title>Book Title</title>");
    book.setAuthor("깡사");
    book.setPrice(30000D);

    log.info("book 클래스 사용중");
    log.info(book.toString());
    model.addAttribute("book", book);
    return "book";
  }

  @GetMapping("/booklist")
  public String bookList(Model model){

    List<BookDto> bookList = new ArrayList<>();
    for(int i=0; i<5; i++){
      Boolean isbn = false;
      if(i>2 ){isbn = true;}
      BookDto book = new BookDto(
      (long)i, isbn, "번째 첵제목"+i,"author" ,(double)5000*i);

      bookList.add(book);
    }

    model.addAttribute("books", bookList);

    return "booklist";
  }

}
