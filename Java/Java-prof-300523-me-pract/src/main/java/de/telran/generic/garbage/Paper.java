package de.telran.generic.garbage;

public class Paper extends Garbage{
    @Override
    public String toString() {
        return "Paper{}";
    }

    @Override
    public double getWeight() {
        return 0.01;
    }
}
