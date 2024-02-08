package org.example._2023_09_06;

public class Test2 {
}


interface MathOperation {
    int add(int a, int b);

    int subtract(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }


    /**
     *
     * @param a  first param
     * @param b  second param
     * @return  the result a / b
     */
    static double divide(double a, double b) {
        if(b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divide by zero");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        double d = MathOperation.divide(a, b);
        System.out.println(d);
    }
}