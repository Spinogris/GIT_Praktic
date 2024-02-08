package com.lab.rmtbanking.creditservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AccountTestDTO {
    /**
     * Account
     */
    private String accountNumber;

    /**
     * Credit
     */
    private String type;
    private String creditLimit;

    /**
     * Card
     */
    private String cardNumber;
    private String balance;
}
