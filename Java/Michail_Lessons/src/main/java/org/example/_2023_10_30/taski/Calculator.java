package org.example._2023_10_30.taski;

public class Calculator {

    // 1. Простое сложение двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Вычитание
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3. Умножение
    public int multiply(int a, int b) {
        return a * b;
    }

    // 4. Деление
    public int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    // 5. Возведение в степень
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 6. Вычисление факториала
    public long factorial(int n) {
        //написать
       return 0;
    }

    // 7. Определение четности числа
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 8. Поиск максимального числа в массиве
    public int findMax(int[] array) {
        //написать
        return 0;
    }

    // 9. Определение простого числа
    public boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 10. Перевод числа в строку с указанием системы счисления
    public String toBaseString(int n, int base) {
        if(base < 2 || base > 16) {
            throw new IllegalArgumentException("Base should be between 2 and 16");
        }
        return Integer.toString(n, base);
    }

    // 11. Вычисление корня числа
    public double sqrt(double a) {
        if(a < 0) {
            throw new IllegalArgumentException("Negative numbers are not supported");
        }
        return Math.sqrt(a);
    }

    // 12. Инвертирование строки
    public String reverseString(String input) {
        //написать

        return null;
    }

    // 13. Проверка, является ли строка палиндромом
    public boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // 14. Вычисление НОД двух чисел
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 15. Перемножение элементов массива
    public long productOfArray(int[] array) {
        //написать
        return 0;
    }

    // 16. Определение длины самого длинного слова в строке
    public int lengthOfLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        int maxLength = 0;
        for(String word : words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }

    // 17. Конвертация температуры из Цельсия в Фаренгейт
    public double celsiusToFahrenheit(double celsius) {
        //написать
        return 0;
    }

    // 18. Проверка на вхождение подстроки в строку (без использования стандартных методов Java)
    public boolean containsSubstring(String main, String sub) {
        //написать
        return true;
    }

    // 19. Сумма цифр числа
    //256 --- 2 + 5 + 6
    public int sumOfDigits(int number) {
        //написать
        return 0;
    }

    // 20. Проверка, является ли год високосным
    public boolean isLeapYear(int year) {
        //написать
        return false;
    }
}