package com.lab.rmtbanking.creditservice.exception;

public class CreditNotFoundException extends RuntimeException {

    public CreditNotFoundException(String message) {
        super(message);
    }
}