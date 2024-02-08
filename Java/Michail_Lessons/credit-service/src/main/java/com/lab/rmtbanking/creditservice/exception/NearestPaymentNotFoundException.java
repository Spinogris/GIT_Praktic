package com.lab.rmtbanking.creditservice.exception;

public class NearestPaymentNotFoundException extends RuntimeException {

    public NearestPaymentNotFoundException(String message) {
        super(message);
    }
}