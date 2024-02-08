package org.example._2023_09_04;

public abstract class Hero {
    String name;

    public Hero(String name) {
        this.name = name;
    }

    abstract void walk();
    abstract void attack();

    void shot() {
        System.out.println("****");
    }
}

interface Flyable {
    void fly11();
    //f2
    //f3
}

interface FlyAble22 {
    void fly22();
}

class H1 extends Hero implements Flyable {

    public H1(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println("H1 walk");
    }

    @Override
    void attack() {
        System.out.println("H1 attack");
    }

    @Override
    public void fly11() {
        System.out.println("H1 fly");
    }
}

class H2 extends Hero implements FlyAble22 {

    public H2(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println("H2 walk");
    }

    @Override
    void attack() {
        System.out.println("H2 attack");
    }

    @Override
    public void fly22() {

    }
}