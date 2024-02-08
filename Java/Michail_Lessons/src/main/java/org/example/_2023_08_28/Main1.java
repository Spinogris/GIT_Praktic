package org.example._2023_08_28;

public class Main1 {
    int a = 5;
    static String s = "hello";

    // x = 10
    // x + y = 25
    //
    private static void m1(int a) {
        // save(a)
    }

    public void get(int a) {
        m1(a);
        System.out.println(a + 15);
    }

    public int returnMinValue(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] qaa = {3, 21, 45, 6, 98, 7};
        System.out.println(new Main1().returnMinValue(qaa));
    }
}