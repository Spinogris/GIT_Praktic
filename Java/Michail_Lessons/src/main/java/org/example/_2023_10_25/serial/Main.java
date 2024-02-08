package org.example._2023_10_25.serial;

import com.github.javafaker.Faker;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person777 person777 = new Person777(new Faker().name().name(), 25);
        System.out.println("Before serial: ");
        System.out.println("Name: " + person777.getName());
        System.out.println("Age: " + person777.getAge());

        //Serial object to file
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
            out.writeObject(person777);
            out.close();
            System.out.println("Serialization was done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Person777 newPerson;

        //Deserialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            newPerson = (Person777) in.readObject();
            in.close();
            System.out.println("DE-Serialization was done");
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

        if (newPerson != null) {
            System.out.println("After serial: ");
            System.out.println("Name: " + newPerson.getName());
            System.out.println("Age: " + newPerson.getAge());
        }
    }
}