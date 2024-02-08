package de.telran.lambda;

import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 25),
                new Person("Jack", 30),
                new Person("Cames", 35),
                new Person("Jill", 40)
        );



        double avr = people.stream()
                .filter(el -> el.getName().startsWith("J"))
                .mapToInt(el -> el.getAge())
                .average()
                .getAsDouble();

        System.out.println(avr);
    }
}

/**
 * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
 * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
 */