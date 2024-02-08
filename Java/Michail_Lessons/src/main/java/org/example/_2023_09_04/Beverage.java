package org.example._2023_09_04;

public abstract class Beverage {
     abstract void consume();
}

class Tea extends Beverage {

    @Override
    void consume() {
        System.out.println("Tea");
    }
}

class Coffee extends Beverage {

    @Override
    void consume() {
        System.out.println("Coffee");
    }
}

class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.consume();

        Beverage cof = new Coffee();
        cof.consume();
    }
}