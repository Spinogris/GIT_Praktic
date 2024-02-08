package org.example._2023_09_11;

import java.util.Objects;

public class EHex1 {
    public static void main(String[] args) {
        System.out.println(new EHex1().hashCode());
        System.out.println(new EHex1().hashCode());
        Auto auto = new Auto();
        auto.name = "BMW";

        Auto auto1 = new Auto();
        auto1.setName("AUDI");

//        System.out.println(auto.hashCode());
//        System.out.println(auto1.hashCode());
//        System.out.println(auto);
    }
}

class Auto implements Comparable<Auto> {
    String name;
    private boolean isSportCar;
    private double horsePower;

    public Auto(String name, boolean isSportCar, double horsePower) {
        this.name = name;
        this.isSportCar = isSportCar;
        this.horsePower = horsePower;
    }

    public Auto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Auto o) {
        return (int) (this.horsePower - o.horsePower);
    }

    //     Книга книга = new Книга();
    //     книга.equals(?)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return Double.compare(horsePower, auto.horsePower) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", isSportCar=" + isSportCar +
                ", horsePower=" + horsePower +
                '}';
    }
}