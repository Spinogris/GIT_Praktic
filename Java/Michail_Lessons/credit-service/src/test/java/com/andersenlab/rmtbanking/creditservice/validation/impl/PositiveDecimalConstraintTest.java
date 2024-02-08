package com.andersenlab.rmtbanking.creditservice.validation.impl;

import com.lab.rmtbanking.creditservice.validation.impl.PositiveDecimalConstraint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Numeric validation")
class PositiveDecimalConstraintTest {

    private final PositiveDecimalConstraint constraint = new PositiveDecimalConstraint();

    

    @DisplayName("Test validation for Numeric")
    @MethodSource("getNumerics")
    @ParameterizedTest
    void testNumericValidation(BigDecimal value, boolean expected) {
        assertEquals(expected, constraint.isValid(value, null));
    }

    private static Stream<Arguments> getNumerics() {
        return Stream.of(
                Arguments.of("0", true),
                Arguments.of("1", true),
                Arguments.of("123456", true),
                Arguments.of("0.0", true),
                Arguments.of("1.01", true),
                Arguments.of("10000.000", true),
                Arguments.of("51.1234", true),
                Arguments.of("0.5555", true),
                Arguments.of("999999999999999.9999", true),
                Arguments.of("9999999999999999999", false),
                Arguments.of("-1", false)
        );
    }
}
