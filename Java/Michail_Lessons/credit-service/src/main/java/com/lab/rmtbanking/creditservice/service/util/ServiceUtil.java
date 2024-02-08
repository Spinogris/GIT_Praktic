package com.lab.rmtbanking.creditservice.service.util;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class ServiceUtil {

    public String createNumberForCreditOrder() {
        return String.format("%d%d", createRandomValue(), createRandomValue());
    }

    private long createRandomValue() {
        double a = Math.random() + (new Random().nextInt(9) + 1);
        return (long) (a * Math.pow(10, 9));
    }
}