package com.andersenlab.rmtbanking.creditservice.validation.impl;

import com.lab.rmtbanking.creditservice.validation.impl.EinConstraint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Ein validation")
class EinConstraintTest {

    private final EinConstraint constraint = new EinConstraint();

    @DisplayName("Test validation for Ein")
    @MethodSource("getEins")
    @ParameterizedTest
    void testUuidValidation(String ein, boolean expected) {
        assertEquals(expected, constraint.isValid(ein, null));
    }

    private static Stream<Arguments> getEins() {
        return Stream.of(
                Arguments.of("1234567890", true),
                Arguments.of("9999999999", true),
                Arguments.of("0000000000", true),
                Arguments.of("", false),
                Arguments.of("0", false),
                Arguments.of("1", false),
                Arguments.of("10", false),
                Arguments.of("12345", false),
                Arguments.of("abcde", false),
                Arguments.of("abcdefghkl", false),
                Arguments.of("123@456789", false)
        );
    }
}