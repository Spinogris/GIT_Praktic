package org.example;

public class Task {
  public int[] taskOdd(int[] numbers) {
    int[] arrayOdd = numbers;
    int n = arrayOdd.length;
    for (int k = 0; k < n - 2; k += 2)
      for (int i = 0; i < n - 2 - k; i += 2) {
        if (arrayOdd[i] > arrayOdd[i + 2]) {
          int t = arrayOdd[i];
          arrayOdd[i] = arrayOdd[i + 2];
          arrayOdd[i + 2] = t;
        }
      }
    return arrayOdd;
  }

  public int[] taskEven(int[] numbers) {
    int[] arrayEv = numbers;
    int n = arrayEv.length;
    for (int k = 0; k < n - 1; k += 2)
      for (int i = 0; i < n - 1 - k; i += 2) {
        if (arrayEv[i] < arrayEv[i + 2]) {
          int t = arrayEv[i];
          arrayEv[i] = arrayEv[i + 2];
          arrayEv[i + 2] = t;
        }
      }
    return arrayEv;
  }
}
