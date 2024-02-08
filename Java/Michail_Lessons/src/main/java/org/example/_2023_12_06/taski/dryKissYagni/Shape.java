package org.example._2023_12_06.taski.dryKissYagni;

// Нарушение SOLID: Нарушение принципа открытости/закрытости
public class Shape {
    public enum Type { CIRCLE, SQUARE }
    
    private Type type;
    
    public Shape(Type type) {
        this.type = type;
    }
    
    public double calculateArea() {
        if (type == Type.CIRCLE) {
            // Вычисление площади круга
        } else if (type == Type.SQUARE) {
            // Вычисление площади квадрата
        }
        return 0.0;
    }
}

// Исправлено:
// Используем полиморфизм и создаем отдельные классы для каждой фигуры.
interface ShapeQ {
    double calculateArea();
}

class Circle implements ShapeQ {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements ShapeQ {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
}
