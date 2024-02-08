package org.example._2023_10_30.unit;

import java.util.ArrayList;
import java.util.List;

public class Unit1 {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }

    public List<Integer> getOnlyEven(int[] numbers) {
        List<Integer> evenList = new ArrayList<>();

        if (numbers == null) {
            throw new NullPointerException();
        } else {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenList.add(number);
                }
            }
        }
        return evenList;
    }
}
