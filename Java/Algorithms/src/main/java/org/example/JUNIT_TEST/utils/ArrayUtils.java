package org.example.utils;

public class ArrayUtils {
  public int maxIndexOf(int[] array) {
    if (array == null || array.length == 0) {
      return -1;
    }

    int position = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > array[position]) {
        position = i;
      }
    }

    return position;
  }
}
