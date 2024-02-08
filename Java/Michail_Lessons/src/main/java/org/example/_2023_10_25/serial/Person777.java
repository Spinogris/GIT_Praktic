package org.example._2023_10_25.serial;

import java.io.Serializable;

public class Person777 implements Serializable {

   // private static final long serialVersionUID = 2L;
    private String name;
    private transient int age;

    public Person777(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person777{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
