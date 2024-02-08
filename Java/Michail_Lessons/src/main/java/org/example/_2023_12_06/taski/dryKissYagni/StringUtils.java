package org.example._2023_12_06.taski.dryKissYagni;

import java.util.stream.Collectors;

// Нарушение KISS: Сложный код для простых задач
public class StringUtils {
    public static String toUpperCase(String input) {
        // Сложная реализация для простой операции
        // ...
        return input.chars()
                .mapToObj(Character::toString)
                .map(s -> {
                    // Добавляем дополнительную логику преобразования, например, пропуск знаков препинания
                    if (s.equals(" ")) {
                        return " ";
                    } else {
                        return s.toUpperCase();
                    }
                })
                .collect(Collectors.joining());
    }
}

// Исправлено:
// Простая операция должна быть выполнена просто.
class StringUtilsW {
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }
}
