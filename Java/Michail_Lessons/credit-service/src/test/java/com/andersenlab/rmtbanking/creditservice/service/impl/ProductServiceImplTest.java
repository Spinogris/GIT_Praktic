package com.andersenlab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.ProductDto;
import com.lab.rmtbanking.creditservice.dto.ProductListDto;
import com.lab.rmtbanking.creditservice.entity.Product;
import com.lab.rmtbanking.creditservice.mapper.ProductMapper;
import com.lab.rmtbanking.creditservice.repository.ProductRepository;
import com.lab.rmtbanking.creditservice.exception.ProductNotFoundException;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import com.lab.rmtbanking.creditservice.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.clearInvocations;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @Mock
    private ProductRepository repository;
    @Mock
    private ProductMapper mapper;
    @InjectMocks
    private ProductServiceImpl service;

    @AfterEach
    public void clearMocks() {
        clearInvocations(repository, mapper);
    }

    @Test
    @DisplayName("Test get all active Products")
    void getAllActiveProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(EntityCreator.getProduct());
        List<ProductDto> productDtoList = new ArrayList<>();
        productDtoList.add(DtoCreator.getProductDto());
        when(repository.getAllByActive(true)).thenReturn(productList);
        when(mapper.productsToProductsDto(productList)).thenReturn(productDtoList);
        ProductListDto productListDto = new ProductListDto(productDtoList);

        ProductListDto actualProductListDto = service.getAllProductsActive();

        assertEquals(actualProductListDto, productListDto);
    }

    @Test
    @DisplayName("Test get info about product")
    void getProductInfoTest() {
        Product product = EntityCreator.getProduct();
        ProductDto productDto = DtoCreator.getProductDto();
        when(repository.findProductById(product.getId())).thenReturn(Optional.of(product));
        when(mapper.toDto(product)).thenReturn(productDto);

        ProductDto actualProductDto = service.getProductById(product.getId());

        assertEquals(actualProductDto, productDto);
    }

    @Test
    @DisplayName("Test throws exception when Product not found")
    void throwExceptionProductNofFound() {
        Product product = EntityCreator.getProduct();
        assertThrows(ProductNotFoundException.class, () -> service.getProductById(product.getId()));
    }
}