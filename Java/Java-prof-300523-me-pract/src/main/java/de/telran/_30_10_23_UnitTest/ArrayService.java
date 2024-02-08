package de.telran._30_10_23_UnitTest;

public class ArrayService {

  public int[] getArrayBySize(int size) {
    if (size < 0) {
      throw new IllegalArgumentException("Размер массива не может быть отрицательным.");
    }
    int[] result = new int[size];
    for (int i = 0; i < result.length; i++) {
      result[i] = i + 1;
    }
      return result;
  }
}
