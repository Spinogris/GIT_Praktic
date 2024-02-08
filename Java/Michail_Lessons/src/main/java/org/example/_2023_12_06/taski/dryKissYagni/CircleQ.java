package org.example._2023_12_06.taski.dryKissYagni;

// Нарушение DRY: Дублирование кода
public class CircleQ {
  private double radius;

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public double calculateCircumference() {
    return 2 * Math.PI * radius;
  }
}

// Исправлено:
// Избавились от дублирования кода, вычислив радиус один раз.
class CircleA {
  private double radius;

  public double calculateArea() {
    double radiusSquared = radius * radius;
    return Math.PI * radiusSquared;
  }

  public double calculateCircumference() {
    return 2 * Math.PI * radius;
  }
}
