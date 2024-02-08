package org.example._16_10_23;

public class Recurs {
  public static void main(String[] args) {
    System.out.println(new Recurs().countWays(7));
  }

  public int countWays(int val) {
    int[] step = new int[val + 1];
    step[0] = 1;

    for (int i = 2; i <= val; i++) {
      step[i] += step[i - 1] ;
    }

    return step[val];
  }

}
