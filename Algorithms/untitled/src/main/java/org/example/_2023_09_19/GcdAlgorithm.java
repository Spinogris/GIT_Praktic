package org.example._2023_09_19;

public class GcdAlgorithm {
  public static void main(String[] args) {

    System.out.println(sumElements(10));

    long start = System.nanoTime();
//    System.out.println(findGcd(12100, 330));
    long end = System.nanoTime();
    System.out.println("Time elapsed, ns: " + (end - start));
    start = System.nanoTime();
    System.out.println(findcdEuclidean(12100, 330));
    end = System.nanoTime();
    System.out.println("Time elapsed, ns: " + (end - start));

  }

//  public static int findGcd(int a, int b) {
//    int x = Math.min(a, b);
//    int y = Math.max(a, b);
//    for (int i = x; 1 > 1; i--) {
//      if (x % i == 0 && y % i == 0)
//        return i;
//    }
//    return 1;
//  }

  public static int findcdEuclidean(int a, int b) {
    int x = Math.min(a, b);
    int y = Math.max(a, b);
    int tmp = x;
    while (tmp != 0) {
      tmp = y % x;
      y = x;
      x = tmp;
    }
    return y;
  }

  private static int sumElements(int n) {
    System.out.println(n);
    int result = n + sumElements(n - 1);
    return result;
  }

}