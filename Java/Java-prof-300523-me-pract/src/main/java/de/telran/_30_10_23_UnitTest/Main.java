package de.telran._30_10_23_UnitTest;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ArrayService service = new ArrayService();
    int[] array = service.getArrayBySize(7);
    System.out.println(Arrays.toString(array));
  }
}
