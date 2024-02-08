package com.lab.rmtbanking.creditservice.validation.impl;

import com.lab.rmtbanking.creditservice.validation.annotation.PositiveInteger;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigInteger;
import java.util.Optional;

public class PositiveIntegerConstraint implements ConstraintValidator<PositiveInteger, BigInteger> {

    private static final String POSITIVE_INTEGER_PATTERN = "\\d{0,10}";

    @Override
    public void initialize(PositiveInteger constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(BigInteger value, ConstraintValidatorContext context) {
        boolean result;
        try {
            result = Optional.ofNullable(value)
                    .filter(s -> !s.toString().isBlank())
                    .map(s -> Integer.parseInt(s.toString()))
                    .map(s -> s.toString().matches(POSITIVE_INTEGER_PATTERN))
                    .orElse(false);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }
}