package org.example._2023_09_11.prac;


public class Department {
  private  String depName;
  private  int depId;
  private Employee employees[] = {
          new Employee("Name1", "Surname1", 10000.0, 01),
          new Employee("Name2", "Surname2", 20000.0, 01),
          new Employee("Name3", "Surname3", 30000.0, 01),
          new Employee("Name4", "Surname4", 40000.0, 02),
          new Employee("Name5", "Surname5", 50000.0, 02),
          new Employee("Name6", "Surname6", 10000.0, 02),
          new Employee("Name7", "Surname7", 20000.0, 03),
          new Employee("Name8", "Surname8", 30000.0, 03),
          new Employee("Name9", "Surname9", 40000.0, 03),
          new Employee("Name10", "Surname10", 5000.0, 04),
          new Employee("Name11", "Surname11", 50000.0, 04),
          new Employee("Name12", "Surname12", 504500.0, 04),
  };

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  public int getDepId() {
    return depId;
  }

  public void setDepId(int depId) {
    this.depId = depId;
  }

  public Department(String depName, int depId) {
    this.depName = depName;
    this.depId = depId;
  }
}