package de.telran.generic.simple.home;

public class Plastic extends Garbage{
    @Override
    public String toString() {
        return "Plastic{}";
    }

    @Override
    public double getWeight() {
        return 0.3; //вес пластика
    }
}
