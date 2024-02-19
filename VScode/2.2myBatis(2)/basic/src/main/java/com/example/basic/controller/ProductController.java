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

import com.example.basic.model.dto.ProductDto;
import com.example.basic.service.ProductService;

@RestController
@RequestMapping("/ver1/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    // localhost:8080/ver1/product/all
    @GetMapping("/all")
    public List<ProductDto> selectAll() {

        return productService.selectAll();
    }

    // localhost:8080/ver1/product/select
    @GetMapping("/select")
    public List<ProductDto> selectProduct(@ModelAttribute ProductDto dto) {
        return productService.selectProduct(dto);
    }

    // localhost:8080/ver1/product/insert
    @PostMapping("/insert")
    public String insertProduct(@RequestBody ProductDto dto) {
        productService.insertProduct(dto);

        return "저장 성공";
    }

    // localhost:8080/ver1/product/update
    @PostMapping("/update")
    public String updateProduct(@RequestBody ProductDto dto) {
        productService.updateProduct(dto);
        return "업데이트 성공";
    }

    // localhost:8080/ver1/product/delete/7
    @GetMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
        return "삭제 성공";
    }
}
