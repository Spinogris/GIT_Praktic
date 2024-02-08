package org.example._2023_10_04;

public class Rec1 {
    private int stepen(int base, int power) {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res = res * base;
        }
        return res;
    }

    private int recStepen(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * recStepen(base, power - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Rec1().recStepen(2, 4));
    }
}
