package org.example._2023_10_23;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ET2 {
    private static void m1() throws FileNotFoundException {
        FileReader reader = new FileReader("2222.txt");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m2");
        m1();
    }

    public static void main(String[] args) throws FileNotFoundException {
        m2();
    }
}