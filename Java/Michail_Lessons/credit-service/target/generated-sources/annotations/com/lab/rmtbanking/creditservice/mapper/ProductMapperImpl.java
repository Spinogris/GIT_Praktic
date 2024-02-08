package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.ProductDto;
import com.lab.rmtbanking.creditservice.entity.Product;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:55:05+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        BigInteger id = null;
        String name = null;
        BigDecimal minSum = null;
        BigDecimal maxSum = null;
        String currencyCode = null;
        BigDecimal minInterestRate = null;
        BigDecimal maxInterestRate = null;
        boolean needGuarantees = false;
        boolean deliveryInCash = false;
        boolean earlyRepayment = false;
        boolean needIncomeDetails = false;

        id = product.getId();
        name = product.getName();
        minSum = product.getMinSum();
        maxSum = product.getMaxSum();
        currencyCode = product.getCurrencyCode();
        minInterestRate = product.getMinInterestRate();
        maxInterestRate = product.getMaxInterestRate();
        needGuarantees = product.isNeedGuarantees();
        deliveryInCash = product.isDeliveryInCash();
        earlyRepayment = product.isEarlyRepayment();
        needIncomeDetails = product.isNeedIncomeDetails();

        ProductDto productDto = new ProductDto( id, name, minSum, maxSum, currencyCode, minInterestRate, maxInterestRate, needGuarantees, deliveryInCash, earlyRepayment, needIncomeDetails );

        return productDto;
    }

    @Override
    public Product toEntity(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDto.getId() );
        product.setName( productDto.getName() );
        product.setMinSum( productDto.getMinSum() );
        product.setMaxSum( productDto.getMaxSum() );
        product.setMinInterestRate( productDto.getMinInterestRate() );
        product.setMaxInterestRate( productDto.getMaxInterestRate() );
        product.setNeedGuarantees( productDto.isNeedGuarantees() );
        product.setDeliveryInCash( productDto.isDeliveryInCash() );
        product.setEarlyRepayment( productDto.isEarlyRepayment() );
        product.setNeedIncomeDetails( productDto.isNeedIncomeDetails() );
        product.setCurrencyCode( productDto.getCurrencyCode() );

        return product;
    }

    @Override
    public List<ProductDto> productsToProductsDto(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            list.add( toDto( product ) );
        }

        return list;
    }
}
