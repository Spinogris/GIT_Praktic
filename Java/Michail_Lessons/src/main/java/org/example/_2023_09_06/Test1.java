package org.example._2023_09_06;

import lombok.NoArgsConstructor;


public class Test1 implements Interf, Runnable {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Test1());
        Test1 test1 = new Test1();
        test1.absM();
        test1.defM();
        Interf.statM();

    }

    @Override
    public void absM() {
        System.out.println("ABS M");
    }

    @Override
    public void run() {

    }
}

interface Interf {
    void absM();

    default void defM() {
        System.out.println("DEF M");
    }

    static void statM() {
        System.out.println("STAT M");
    }
}