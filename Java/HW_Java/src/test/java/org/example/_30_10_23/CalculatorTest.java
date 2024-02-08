package org.example._30_10_23;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

  Calculator calculator = new Calculator();

  public void testAdd() {
    int result = calculator.add(2, 3);
    assertEquals(5, result);
  }

  public void testSubtract() {
    int result = calculator.subtract(5, 3);
    assertEquals(2, result);
  }

  public void testMultiply() {
    int result = calculator.multiply(4, 5);
    assertEquals(20, result);
  }

  public void testDivide() {
    int result = calculator.divide(10, 2);
    assertEquals(5, result);
  }

  public void testPower() {
    double result = calculator.power(2, 3);
    assertEquals(8.0, result, 0.001);
  }

  public void testFactorial() {
    var result = calculator.factorial(5);
    assertEquals(120, result);
  }

  public void testIsEven() {
  }

  public void testFindMax() {
  }

  public void testIsPrime() {
  }

  public void testToBaseString() {
  }

  public void testSqrt() {
  }

  public void testReverseString() {
  }

  public void testIsPalindrome() {
  }

  public void testGcd() {
  }

  public void testProductOfArray() {
  }

  public void testLengthOfLongestWord() {
  }

  public void testCelsiusToFahrenheit() {
  }

  public void testContainsSubstring() {
  }

  public void testSumOfDigits() {
  }

  public void testIsLeapYear() {
  }
}