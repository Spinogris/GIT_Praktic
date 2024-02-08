package org.example._2023_12_06.taski.dryKissYagni;

import java.util.List;

// Нарушение KISS: Избыточная сложность
public class MathUtils {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}

// Исправлено:
// Избыточные методы объединены в один.
class MathUtilsQ {
    public static int calculateSum(Iterable<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}
