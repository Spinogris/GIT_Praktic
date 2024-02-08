package de.telran.queue;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SortCollectionSimple {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(
                Arrays.asList(new Person("Вася", 18),
                        new Person("Петя", 25),
                        new Person("Вася", 15))
        );
        persons.add(new Person("Вася", 30));

        System.out.println(persons);

//        Collections.sort(persons);
//        System.out.println(persons);

        Collections.sort(persons, Comparator.comparing(Person::getName).reversed());
        System.out.println(persons);

        Collections.sort(persons, Comparator.comparing(Person::getName).thenComparing(Person::getAge).reversed());
        System.out.println(persons);

        // С лямбда выражением
        Collections.sort(persons, Comparator.comparing((person)-> person.getAge()));
        System.out.println(persons);

        TreeSet<Person> treeSet = new TreeSet<>(Comparator.comparingInt(Person::getAge).reversed());
        treeSet.addAll(persons);
        System.out.println(treeSet.add(new Person("Вася", 30)));  // не добавиться
        System.out.println(treeSet);

//        treeSet = new TreeSet<>(persons);
//        treeSet.addAll(persons);

        //Схлопывание данные по Васе
        Map<Person, Integer> treeMap = new TreeMap<>(Comparator.comparing(Person::getName));
        treeMap.put(new Person("Вася", 18), 1);
        treeMap.put( new Person("Петя", 25), 3);
        treeMap.put(new Person("Вася", 15), 2);
        System.out.println(treeMap);

        //Решаем проблему со схлопыванием данных по Васе
        treeMap = new TreeMap<>(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        treeMap.put(new Person("Вася", 18), 1);
        treeMap.put( new Person("Петя", 25), 3);
        treeMap.put(new Person("Вася", 15), 2);
        System.out.println(treeMap);

        Set<Person> sets = new TreeSet<>();

    }
}
