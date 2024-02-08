package org.example._2023_09_11.prac;

public class Employee {

  private String name;
  private String surName;
  private double salary;
  public Department department;
  private int depId;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public Employee(String name, String surName, double salary, int depId) {
    this.name = name;
    this.surName = surName;
    this.salary = salary;
    this.depId = depId;
    this.department = new Department("name", 0);
  }
}