package org.example._2023_10_04;

public class Rec3 {
    public static void main(String[] args) {
        m1(Rec3::rr);

    }

    public static void rr() {
        System.out.println("^^^^");
        System.out.println("&&&&");
        System.out.println("$$$$");
    }

    public static void m1(Inter1 inter) {
        System.out.println("****");
        inter.get1();
    }
}

@FunctionalInterface
interface Inter1 {
    void get1();
}
