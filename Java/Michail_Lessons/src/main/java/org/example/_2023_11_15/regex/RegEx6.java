package org.example._2023_11_15.regex;

import com.github.javafaker.Faker;

public class RegEx6 {
    private static final Faker FAKER = new Faker();
    private static void info(Student student) {
        System.out.printf("%03d \t %-10s \t %-10s \t %,.1f \n",
                        student.id, student.name, student.surname, student.salary*(1 + student.pct));
    }
    public static void main(String[] args) {
      Student student = new Student(1, FAKER.name().name(), FAKER.name().lastName(), 7777, .2d);
      info(student);
    }
}

class Student {
    int id;
    String name;
    String surname;
    int salary;
    double pct;

    public Student(int id, String name, String surname, int salary, double pct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.pct = pct;
    }
}
