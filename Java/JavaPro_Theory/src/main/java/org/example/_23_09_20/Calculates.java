package org.example._23_09_20;

import java.util.Scanner;

public class Calculates {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите высоту:");
    double h = scanner.nextDouble();
    System.out.println("Введите ширину:");
    double b = scanner.nextDouble();
    scanner.close();
    double p = (h + b) * 2;
    double square = (h * b) / 1000;
    System.out.println("Периметр  равен " + p + " см.");
    System.out.println("Площадь равна " + square + " м.");
  }

}
