package com.lab.rmtbanking.creditservice.dto;

import lombok.Value;

import java.math.BigDecimal;
import java.math.BigInteger;

@Value
public class ProductDto {

    BigInteger id;
    String name;
    BigDecimal minSum;
    BigDecimal maxSum;
    String currencyCode;
    BigDecimal minInterestRate;
    BigDecimal maxInterestRate;
    boolean needGuarantees;
    boolean deliveryInCash;
    boolean earlyRepayment;
    boolean needIncomeDetails;
}