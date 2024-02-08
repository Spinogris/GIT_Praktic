package org.example._2023_12_06.taski.dryKissYagni;

import java.util.List;

// Нарушение CODE SMELLS: Длинный метод
public class Data {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        double standardDeviation = Math.sqrt(variance / numbers.size());

        return standardDeviation;
    }
}

// Исправлено:
// Разбили длинный метод на более мелкие методы.
class DataQ {
    public double calculateAverage(List<Double> numbers) {
        double sum = calculateSum(numbers);
        double average = sum / numbers.size();
        double variance = calculateVariance(numbers, average);
        return Math.sqrt(variance / numbers.size());
    }

    private double calculateSum(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    private double calculateVariance(List<Double> numbers, double average) {
        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        return variance;
    }
}
