package com.lab.rmtbanking.creditservice.dto;

import com.lab.rmtbanking.creditservice.validation.annotation.Ein;
import com.lab.rmtbanking.creditservice.validation.annotation.PositiveDecimal;
import com.lab.rmtbanking.creditservice.validation.annotation.PositiveInteger;
import lombok.Value;

import java.math.BigDecimal;
import java.math.BigInteger;

@Value
public class CreateCreditOrderDto {

    @PositiveInteger
    BigInteger productId;

    @PositiveDecimal
    BigDecimal amount;

    @PositiveInteger
    BigInteger periodMonths;

    @PositiveDecimal
    BigDecimal monthlyIncome;

    @PositiveDecimal
    BigDecimal monthlyExpenditure;

    @Ein
    String employerIdentificationNumber;
}