package de.telran.lesson20231020;

import de.telran.lesson20230929.Monkey;

import java.util.ArrayList;
import java.util.List;

public class TaskWithMonkey {

  public static void main(String[] args) {


    Monkey monkey1 = new Monkey("A", 3, "grey", false, 10.9);
    Monkey monkey2 = new Monkey("A", 2, "white", true, 10.1);
    Monkey monkey3 = new Monkey("T", 3, "grey", false, 5);
    Monkey monkey4 = new Monkey("J", 2, "black", true, 7);
    Monkey monkey5 = new Monkey("Y", 1, "grey", true, 6);

    List<Monkey> monkeys = new ArrayList<>();
    monkeys.add(monkey1);
    monkeys.add(monkey2);
    monkeys.add(monkey3);
    monkeys.add(monkey4);
    monkeys.add(monkey5);
    // Получить Map имя / информация, голодна ли обезьянка
    Map<String, Boolean> namyAndIsHungry = monkeys.stream().collect(
            Collectors.toMap(monkey -> monkey.getName(), monkey -> monkey.isHungry(), (x, y) -> x)
    );
    //Получить Map цвет / количество обезьян данного цвета
    Map<String, Long> groupByColour = monkeys.stream)
    .collect(Collectors
            .groupingBy(monkey -> monkey.getColour(), Collectors
                    .counting()));
    //Получить Map цвет / список имен обезьян данного цвета
    Map<String, List<String>> groupByColourTolist = monkeys.stream().collect(
            Collectors.groupingBy(
                    monkey -> monkey.getColour(), Collectors.mapping(monkey -> monkey.getName(), Collectors.toList())
            ))
    System.out.println(groupByColourToList);
    //Создать компаратор и отсортировать исходный список по весу и имени
    monkeys.stream()
            .sorted((01, 02) > 01.getWeight() == 02.getWeight() ? 0 : (01.getWeight() < 02.getWeight() ? -1 : 1);
  }
}
