package org.example.math;

public class Calc {
  public double div(int x, int y) {
    if (y == 0) throw new ArithmeticException("На ноль не делят! Дубина... ");
    return ((double) x) / y;
  }

  public boolean isEven(int x) {
    return x % 2 == 0;
  }

  public String bar(){
    return null;
  }


}
