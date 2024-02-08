package org.example._2023_10_04.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class S1 {
    public static boolean get(int i) {
        return i % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 1, 6, 5, 4, 9, 9, 9, 9, 87);
        int[] arr = {65, 4, 32, 19, 8, 7};

        //list.stream(); for List
        //Arrays.stream(arr); for arrays
        //Create Stream -> intermediate methods -> terminal methods
        List<Integer> list1 = list.stream() //32, 1, 6, 5, 4, 9, 87
                .filter(digit -> digit % 2 == 0) //32, 6, 4
                .map(el -> el * 10) // 320, 60, 40
                .toList();
        // System.out.println(list1);

        List<Integer> list2 = list.stream() //32, 1, 6, 5, 4, 9, 87
                .filter(digit -> digit % 2 == 0) //32, 6, 4
                .map(el -> {
                    if (el < 10) {
                        el = el * 11;
                    }
                    return el;
                })
                .toList();
        //   System.out.println(list2);

        List<String> list3 = list.stream() //32, 1, 6, 5, 4, 9, 87
                .filter(S1::get) //32, 6, 4
                .map(String::valueOf) // 320, 60, 40
                .toList();
        //  System.out.println(list3);

        Stream<Integer> st = Stream.of(32, 1, 6, 5, 4, 9, 87); // == list.stream()

        List<Integer> list4 = list.stream()
                .distinct()
                .toList();
        //   System.out.println(list4);

        List<Integer> list5 = list.stream()
                .filter(el -> el % 2 == 1)
                .sorted()
                .distinct()
                .toList();
        System.out.println(list5);
    }
}