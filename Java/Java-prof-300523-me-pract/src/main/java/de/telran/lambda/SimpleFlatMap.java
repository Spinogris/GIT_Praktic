package de.telran.lambda;

import java.io.Serializable;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleFlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6)
                .flatMap(x -> {
                    if (x % 2 == 0) {
                        return Stream.of(-x, x);
                    }
                    return Stream.empty();
                })
                .forEach(System.out::println);
        System.out.println();
        Stream.of(1, 2, 3, 4, 5, 6)
                .mapMulti((x, consumer) -> {
                    if (x % 2 == 0) {
                        consumer.accept(-x);
                        consumer.accept(x);
                    }
                })
                .forEach(System.out::println);

        System.out.println();

        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::println);


        String[][] arrStr = { {"a", "b", "c"},
                            {"d", "e", "f"},
                            {"g", "o", "y"}};

        List<String> lists = Arrays.stream(arrStr)
                .flatMap(x->Arrays.stream(x))
                .collect(Collectors.toList());
        System.out.println(lists);

        // Убираем ряд
        Arrays.stream(arrStr)
                .filter(el -> !Arrays.stream(el).anyMatch(x->x.contains("a")))
                .flatMap(x->Arrays.stream(x))
                .forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,6,7,8);
        List<Integer> list3 = Arrays.asList(9,10,11,12);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listInt = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(listInt);

        IntSummaryStatistics stat = listOfLists.stream()
                .flatMap(x -> x.stream())
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(stat);


        List<? extends Serializable> listObj =  Arrays.asList("слон",2,3.5,true);
        listObj.stream().forEach(System.out::println);

        List<? extends Number> listNum =  Arrays.asList(2,3.5,4,6,33.5);
        listNum.stream().filter(x -> x.doubleValue() > 4)
                .map(x -> x.doubleValue()+10)
                .forEach(System.out::println);

    }
}
