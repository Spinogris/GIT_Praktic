package org.example._2023_11_22;
//
public class Rob {
    public int wayNumber(int n, int m) {
        if (n < 1 || m < 1) {
            return 0;
        }

        if (n == 1 || m == 1) {
            return 1;
        }
        return wayNumber(n - 1, m) + wayNumber(n, m - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Rob().wayNumber(5, 5));
    }
}
