package org.example._2023_10_18;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Алгоритм Луна
 * 1234 1234 1234 1234 02/25 665
 */
public class StreamCollectExample {
    static MyCollection m() {
        return new MyCollection();
    }

    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {
        /**
         * Collectors - collect to DataStructure
         * Collections -
         */

        List<String> list = Stream.of("A", "S", "D").collect(Collectors.toList());
        System.out.println(list);

        //List<Integer> list = new ArrayList<>();
        //list.stream  = Stream.of(1,2,3,4,3,2,1,2,3,4,5)
        Set<Integer> set = Stream.of(1,2,3,4,3,2,1,2,3,4,5).collect(Collectors.toSet());

        Map<Integer, String> map = Stream.of("mama", "mylas", "ram")
                .collect(Collectors.toMap(str -> str.length(), el -> el));
        System.out.println(map);

        MyCollection<Dog> dogMyCollection = Stream.of(
                new Dog(FAKER.name().name(), 5),
                new Dog(FAKER.name().name(), 3),
                new Dog(FAKER.name().name(), 4)
        //).collect(MyCollection::new, MyCollection::add, MyCollection::addAll);
        ).collect(() -> new MyCollection<>(),
                (coll, el) -> coll.add(el),
                (collection1, colleсtion2) -> collection1.addAll(colleсtion2));
        System.out.println(dogMyCollection);

        List<String> list1 = Stream.of("mama", "mylas", "ram", "mama")
                .collect(Collectors.collectingAndThen(Collectors.toSet(), ArrayList::new));
        System.out.println(list1);







    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class MyCollection<T> extends ArrayList<T> {

}