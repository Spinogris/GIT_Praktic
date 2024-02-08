package org.example._2023_10_16.generics.generics;

public class GE3 {
    public static void main(String[] args) {
        Show<String, Integer> show = new Show<>("W", 88);
        Show<String, Integer> show1 = new Show<>("W", 88);
        System.out.println(show.getValue1() + " : " + show.getValue2());
    }
}

class Show<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Show(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Show{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}