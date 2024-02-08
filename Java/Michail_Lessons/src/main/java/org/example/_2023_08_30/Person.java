package org.example._2023_08_30;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private int age = 25;
    private String name = "Name";
    private Dog dog = new Dog("!!!");

    public Person() {
    }

    public Person(int age, String name, Dog dog) {
        this.age = age;
        this.name = name;
        this.dog = dog;
    }

    public void get() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }

    public static void main(String[] args) {
        //тип ссылка = объект конструктор
        //Dog dog1 = new Dog(); //Dog(String name)
//        Animal animal = new Animal();
//        Person person = new Person(25, "Name", dog1);
//        System.out.println(person.name);
//
//        Person person1 = new Person();
//        Person person2 = new Person();
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person);

        Dog dog = new Dog("Tuzik");
        Dog dog1 = new Dog("Tyson");
        Person per = new Person(29, "Dmitry", dog);

        per.dog = dog1;
        per.get();
    }
}

class Animal {

}

class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "!!!!Dog: " + name + "-----";
    }
}

class Cat extends Animal {
    String name;
}