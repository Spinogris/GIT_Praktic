package org.example._2023_12_06.taski.dryKissYagni;

import java.util.List;

public class D1 {
    // Нарушение CODE SMELLS: Длинные имена переменных

    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        double sumOfAllValues = 0;
        for (double currentValue : listOfNumbers) {
            sumOfAllValues += currentValue;
        }
        return sumOfAllValues / listOfNumbers.size();
    }
}

// Исправлено:
// Избавились от длинных имен переменных.
class D1Q {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}

