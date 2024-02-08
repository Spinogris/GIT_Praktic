package com.lab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.ProductDto;
import com.lab.rmtbanking.creditservice.dto.ProductListDto;
import com.lab.rmtbanking.creditservice.mapper.ProductMapper;
import com.lab.rmtbanking.creditservice.repository.ProductRepository;
import com.lab.rmtbanking.creditservice.service.ProductService;
import com.lab.rmtbanking.creditservice.exception.ErrorMessage;
import com.lab.rmtbanking.creditservice.exception.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    @Transactional(readOnly = true)
    public ProductDto getProductById(BigInteger id) {
        return productMapper.toDto(productRepository.findProductById(id).orElseThrow(
                () -> new ProductNotFoundException
                        ((ErrorMessage.CREDIT_PRODUCT_NOT_FOUND))));
    }

    public ProductListDto getAllProductsActive() {
        log.info("Get all active products");
        return new ProductListDto
                (productMapper.productsToProductsDto
                        (productRepository.getAllByActive(true)));
    }
}