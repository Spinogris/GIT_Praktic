package org.example._2023_10_04;

public class Rec2 {
    public static void main(String[] args) {
        m(() -> {
            System.out.println();
            System.out.println("&&&&");
            System.out.println("$$$$");
        });
    }

    public static void m(Inter inter) {
        System.out.println("****");
        inter.get();
    }
}

@FunctionalInterface
interface Inter {
    void get();
}