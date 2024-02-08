package com.lab.rmtbanking.creditservice.service;

import com.lab.rmtbanking.creditservice.dto.ProductDto;
import com.lab.rmtbanking.creditservice.dto.ProductListDto;

import java.math.BigInteger;

public interface ProductService {

    ProductDto getProductById(BigInteger id);

    ProductListDto getAllProductsActive();
}