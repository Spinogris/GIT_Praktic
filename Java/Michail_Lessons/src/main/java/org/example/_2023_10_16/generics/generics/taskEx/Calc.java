package org.example._2023_10_16.generics.generics.taskEx;

public class Calc<T extends Number> {
    private T value;

    public Calc(T value) {
        this.value = value;
    }

    public double add(Calc<? extends Number> other) {
        return this.value.doubleValue() + other.value.doubleValue();
    }
}
