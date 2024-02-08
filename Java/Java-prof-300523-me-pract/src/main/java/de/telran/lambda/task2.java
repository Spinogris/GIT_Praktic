package de.telran.lambda;

import java.util.Arrays;
import java.util.List;
public class task2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        int max = list.stream()
                .filter(el -> el % 2 != 0)
                .max(Integer::compareTo)
                .get();
        System.out.println(max);
    }
}
