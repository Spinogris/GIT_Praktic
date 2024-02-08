package org.example._2023_08_30.enums;

import java.util.Arrays;

public enum Department {
    HR, SECURITY, FINANCE, SALES
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mike", Department.SALES, AccessLevel.LOW);
        Employee e2 = new Employee("Paol", Department.FINANCE, AccessLevel.MEDIUM);
        Employee e3 = new Employee("Elena", Department.HR, AccessLevel.MEDIUM);
        Employee e4 = new Employee("Carl", Department.SECURITY, AccessLevel.HIGH);

        Employee[] employees = {e1, e2, e3, e4};

//        for (int i = 0; i < employees.length; i++) {
//            if(employees[i].getAccessLevel() == AccessLevel.HIGH) {
//                System.out.println(employees[i].getName() + " go");
//            }
//        }

//        Department department = Department.valueOf("FINANCe");
//        System.out.println(department);

        Department[] departments = Department.values();
        System.out.println(Arrays.toString(departments));

    }
}