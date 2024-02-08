package org.example._2023_11_6.mockEx;

public class CreateTradeException extends RuntimeException {
    public CreateTradeException() {
        super("***Cannot create such trade!***");
    }
}
