package org.example._23_09_13;

public class Employee {
  private String name;
  private String surName;
  private double salary;

  public Employee(String name, String surName, double salary, int depId) {
    this.name = name;
    this.surName = surName;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", surName='" + surName + '\'' +
            ", salary=" + salary +
            '}';
  }

  public String getName() {
    return name;
  }


  public String getSurName() {
    return surName;
  }

  public double getSalary() {
    return salary;
  }
}
