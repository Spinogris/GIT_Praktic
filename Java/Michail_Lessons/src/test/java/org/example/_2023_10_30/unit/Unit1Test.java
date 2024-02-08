package org.example._2023_10_30.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

class Unit1Test {
    private Unit1 unit = new Unit1();

    @Test
    void dividePositiveTest() {
        double a = 10;
        double b = 10;
        double expected = 1;
        Assertions.assertEquals(expected, unit.divide(a, b));
    }

    @Test
    @DisplayName("Test throws bla bla bla")
    void divideByZeroTest() {
        double a = 10;
        double b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> unit.divide(a, b));
    }

    @Test
    void getOnlyEvenPositiveTest() {
        int[] param = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> expextedList = List.of(2, 4, 6, 8, 10);
        Assertions.assertEquals(expextedList, unit.getOnlyEven(param));
    }

    @Test
    void getOnlyEvenWithNullPointerExceptionTest() {
        Assertions.assertThrows(NullPointerException.class, () -> unit.getOnlyEven(null));
    }
}