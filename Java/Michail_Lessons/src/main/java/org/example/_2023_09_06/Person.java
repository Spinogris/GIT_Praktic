package org.example._2023_09_06;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Person extends Object implements Comparable<Person> {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getMax(int[] arr) {
        //.....
        return arr.length;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "***";
    }


    //p1.compareTo(p1)
    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}

class SalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}

class Main11 {
    public static void main(String[] args) {
        Person p1 = new Person("Nik", 25, 7850);
        Person p2 = new Person("Mik", 21, 11156);
        Person p3 = new Person("Olga", 31, 2580);
        Person p4 = new Person("Masha", 42, 452);

        p1.compareTo(p2);


//        Person[] people = {p1, p2, p3, p4};
//        System.out.println(Arrays.toString(people));
//
//        Arrays.sort(people);
//        System.out.println(Arrays.toString(people));

        List<Person> personList = new ArrayList<>();
        personList.add(p1); // boolean
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        System.out.println(personList);

        Collections.sort(personList, new SalaryComparator());
        System.out.println(personList);
    }
}