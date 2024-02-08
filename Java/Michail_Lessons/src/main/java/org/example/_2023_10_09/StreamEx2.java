package org.example._2023_10_09;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 1, 6, 5, 4, 9, 9, 9, 9, 87);
        List<Integer> list1 = Arrays.asList(32, 1, 6, 5, 4, 9, 9, 9, 9, 87);

        List<List<Integer>> listList = new ArrayList<>();
        listList.add(list);
        listList.add(list1);

        //limit()
        list.stream()
                .limit(1)
                .toList();

        //skip
        list.stream()
                .skip(1)
                .toList();

        //forEach()
        list.stream().forEach(System.out::println);

        //anyMatch, allMatch, noneMatch
        boolean b = list.stream()
                .anyMatch(el -> el < 8);

        Optional<Integer> optionalI = list.stream()
                .filter(el -> el < 0)
                .findFirst();
        System.out.println(optionalI);

        //collect()
//        list.stream()
//                .collect();

        //flatMap()
        List<List<Integer>> listList22 = Arrays.asList(
                Arrays.asList(1, 2, 22),
                Arrays.asList(3, 4, 33),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8)
        );

        List<Integer> integers = listList22.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(integers);
    }
}
