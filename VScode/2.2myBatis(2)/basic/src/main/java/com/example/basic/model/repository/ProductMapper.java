package com.example.basic.model.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.basic.model.dto.ProductDto;

@Mapper
public interface ProductMapper {
    
    public List<ProductDto> selectAll();
    public List<ProductDto> selectProduct(ProductDto dto);
    public void insertProduct(ProductDto dto);
    public void updateProduct(ProductDto dto);
    public void deleteProduct(@Param("productId") int productId);
}
