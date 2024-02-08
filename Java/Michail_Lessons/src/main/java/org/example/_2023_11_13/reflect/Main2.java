package org.example._2023_11_13.reflect;

import java.lang.reflect.Field;

public class Main2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Emp emp = new Emp(99, "NIK", "IT");
        Class classs = emp.getClass();

        Field field = classs.getDeclaredField("salary");
        field.setAccessible(true); //!!!!

        double salary = (double) field.get(emp);
       // System.out.println(salary);

        field.set(emp, 2222);
        System.out.println(emp);
    }
}