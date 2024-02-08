package com.andersenlab.rmtbanking.creditservice.validation.impl;

import com.lab.rmtbanking.creditservice.validation.impl.PositiveIntegerConstraint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

@DisplayName("Test integer value validation")
public class PositiveIntegerConstraintTest {

    private final PositiveIntegerConstraint constraint = new PositiveIntegerConstraint();

    @DisplayName("Test validation for positive range integer")
    @MethodSource("getIntegerValues")
    @ParameterizedTest
    public void testIntegerValidation(BigInteger value, boolean expected) {
        Assertions.assertEquals(expected, constraint.isValid(value, null));
    }

    private static Stream<Arguments> getIntegerValues() {
        return Stream.of(
                Arguments.of("0", true),
                Arguments.of("1", true),
                Arguments.of("123456", true),
                Arguments.of("2147483647", true),
                Arguments.of("2147483648", false),
                Arguments.of("9999999999", false),
                Arguments.of("-1", false)
        );
    }
}
