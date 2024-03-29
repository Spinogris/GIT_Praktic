package org.example._2023_10_16.generics.generics;

public class GE2 {
    public static void main(String[] args) {
        Information<String> information = new Information<>("EE");
        System.out.println(information);

        String str = information.getValue();
        System.out.println(str);

        Information<Integer> integerInformation = new Information<>(999);
        System.out.println(integerInformation);
    }
}

class Information<T> {
    private T value;

    public Information(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Information{" +
                "value=" + value +
                '}';
    }
}