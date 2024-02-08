package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.ProductDto;
import com.lab.rmtbanking.creditservice.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto toDto(Product product);

    Product toEntity(ProductDto productDto);

    List<ProductDto> productsToProductsDto(List<Product> products);
}