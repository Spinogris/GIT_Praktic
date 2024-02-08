package com.lab.rmtbanking.creditservice.repository;

import com.lab.rmtbanking.creditservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, BigInteger> {

    Optional<Product> findProductById(BigInteger id);

    List<Product> getAllByActive(Boolean active);
}