package com.lab.rmtbanking.creditservice.controller;

import com.lab.rmtbanking.creditservice.dto.ProductDto;
import com.lab.rmtbanking.creditservice.dto.ProductListDto;
import com.lab.rmtbanking.creditservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/auth/credit-products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductService productService;

    @GetMapping("/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDto getInfoAboutProduct(@PathVariable BigInteger productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ProductListDto getAllProducts() {
        return productService.getAllProductsActive();
    }
}