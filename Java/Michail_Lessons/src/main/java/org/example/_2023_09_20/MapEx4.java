package org.example._2023_09_20;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();//16
        map.put(111, "Q");
        map.put(12, "QW");
        map.put(13, "QS");
        map.put(14, "DD");
        map.put(15, "QR");
        map.put(1, "WWQR");

        System.out.println(map.hashCode());

        Map<Car, String> carStringMap = new TreeMap<>();
        Car car = new Car("P", true, 255);
        Car car1 = new Car("P", true, 255);
        Car car2 = new Car("P", true, 255);
        Car car3 = new Car("P", true, 255);
        carStringMap.put(car, "Q");

        byte b = 11; // -128 ----- 127
        byte c  = 30;
        byte d = (byte) (b * c); //330 -127
        System.out.println(d);



    }
}

@Getter
@ToString
class Car implements Comparable<Car>{
    private String model;
    private boolean isSport;
    private int horsePower;

    public Car(String model, boolean isSport, int horsePower) {
        this.model = model;
        this.isSport = isSport;
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Car o) {
        return this.horsePower - o.horsePower;
    }
}
