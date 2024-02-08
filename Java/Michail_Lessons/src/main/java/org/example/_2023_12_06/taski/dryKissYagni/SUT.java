package org.example._2023_12_06.taski.dryKissYagni;

public class SUT {
    // Нарушение DRY: Дублирование кода

    public static String toUpperCase1(String input) {
        return input.toUpperCase();
    }

    public static String toLowerCase2(String input) {
        return input.toLowerCase();
    }

    // Дублирование конвертации строки в массив символов
    public static char[] toCharArray2(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }
}

    // Исправлено:
// Убрали дублирование кода, используя стандартные методы
 class SUTQ {
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static char[] toCharArray(String input) {
        return input.toCharArray();
    }
}