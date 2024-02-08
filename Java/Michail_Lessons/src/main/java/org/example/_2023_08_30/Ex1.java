package org.example._2023_08_30;

import javax.swing.*;

public class Ex1 extends JFrame {
    //m()
    static String smth;
    int age;

    @Override
    public String toString() {
        return "****Ex1: [" + age + "]****";
    }

    public static void main(String[] args) {
        System.out.println(new Ex1());
    }
}