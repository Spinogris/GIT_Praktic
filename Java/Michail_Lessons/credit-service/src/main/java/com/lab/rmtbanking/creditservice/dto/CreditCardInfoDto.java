package com.lab.rmtbanking.creditservice.dto;

import lombok.Value;

@Value
public class CreditCardInfoDto {
    //t1
    String accountNumber;
    String principalDebt;
    String name;
    String creditLimit;
    String currencyCode;
    String terminationDate;
    String holderName;

    //t2
    String expirationDate;

    //t3
    String balance;
    String transactionLimit;
    String paymentSystem;

    //t4
    String status;
}