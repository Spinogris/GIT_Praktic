package org.example._2023_09_04;

/**
 * Статические методы в интерфейсах предоставляют удобный
 * способ создания служебных методов, которые не требуют создания экземпляра класса.
 */
interface MathOperation {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        int sum = MathOperation.add(5, 3); // Используется статический метод
        int difference = MathOperation.subtract(10, 4); // Используется статический метод

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
