package com.lab.rmtbanking.creditservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class CreditCardDto {

    String cardId;

    BigDecimal creditLimit;

    BigDecimal interestRate;

    BigDecimal principalDebt;

    BigDecimal interestDebt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    String paymentDate;

    BigDecimal paymentPrincipal;

    BigDecimal paymentInterest;

    String cardNumber;

    String accountNumber;

    String holderName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    String expirationDate;

    String paymentSystem;

    BigDecimal balance;

    BigDecimal transactionLimit;
}