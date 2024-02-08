package com.example.ivantest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IvanTestApplication {

    public static void main(String[] args) {

//        System.out.println("Hello world!");



    }

    public class Calculator {


        public int sum(int a, int b) {
            return a + b;
        }

        public int sub(int a, int b) {
            return a - b;
        }


        public int mul(int a, int b) {
            return a * b;
        }

        public double div(int a, int b) {
            return (double) a / (double) b;
        }

        @Override       // Переопределяем метод toString класса Object
        public String toString() {
            return "Объект класса Calculator";
        }
    }

