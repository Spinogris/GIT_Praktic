package org.example._25_10_23;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;
import java.util.List;

@Getter
@Setter
@ToString
public class Students implements Serializable {
  private String name;
  private int age;
  private int grade;


  public Students(String name, int age, int grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  public static void main(String[] args) throws RuntimeException {
    Students students = new Students(new Faker().name().name(), 30, 4);

    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
      System.out.println("Serialization was done");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    Students stud = null;

    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("students.txt"))) {

      System.out.println("DE-Serialization was done");

    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }


}
