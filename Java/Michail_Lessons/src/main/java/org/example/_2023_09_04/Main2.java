package org.example._2023_09_04;

/**
 * Дефолтный метод - это метод, который имеет реализацию по умолчанию в интерфейсе.
 * Классы, реализующие интерфейс, могут использовать эту реализацию
 * или переопределить метод по своему усмотрению.
 */
interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop(); // Используется дефолтная реализация метода stop()
    }
}
