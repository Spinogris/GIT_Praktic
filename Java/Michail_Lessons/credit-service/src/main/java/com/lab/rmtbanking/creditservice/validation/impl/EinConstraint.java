package com.lab.rmtbanking.creditservice.validation.impl;

import com.lab.rmtbanking.creditservice.validation.annotation.Ein;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;

public class EinConstraint implements ConstraintValidator<Ein, String> {

    private static final String EIN_PATTERN = "\\d{10}";

    @Override
    public void initialize(Ein constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Optional.ofNullable(value)
                .filter(s -> !s.isBlank())
                .map(s -> s.matches(EIN_PATTERN))
                .orElse(false);
    }
}