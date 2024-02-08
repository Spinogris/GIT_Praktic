package de.telran.generic.simple.home;

public class Glass extends Garbage{
    @Override
    public String toString() {
        return "Glass{}";
    }

    @Override
    public double getWeight() {
        return 0.5; //вес стекла
    }
}
