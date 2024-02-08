package org.example._2023_11_6;

import java.util.ArrayList;
import java.util.List;

public class SimpleMockExample {
    public int sum(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public String calculate(int a) {
        int result = mult(10, 10) + sum(10, 10);
        return "" + (result * a);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    }
}
