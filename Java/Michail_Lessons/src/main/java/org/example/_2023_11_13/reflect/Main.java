package org.example._2023_11_13.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class empClass = Class.forName("org.example._2023_11_13.reflect.Emp");
        ////////////////////////////////////////////////////////////////////////////////
        Field field = empClass.getField("id");
        System.out.println("Field type: " + field.getType());
        System.out.println("///////////////////////////////////////////////////////");

        Field[] fields = empClass.getFields();
        for (Field f : fields) {
            System.out.println("Type: " + f.getType() + " : " + "Name: " + f.getName());
        }
        System.out.println("///////////////////////////////////////////////////////");

        Field[] allFields = empClass.getDeclaredFields();
        for (Field f : allFields) {
            System.out.println("Type---> " + f.getType() + " : " + "Name---> " + f.getName());
        }
        System.out.println("///////////////////////////////////////////////////////");

        Method method = empClass.getMethod("increase");
        System.out.println("ReturnType ---> " + method.getReturnType());

        Method[] methods = empClass.getMethods();
        for (Method m : methods) {
            System.out.println("Name ---> " + m.getName() +
                               " Return Type ---> " + m.getReturnType() +
                               " Parameter Type ---> " + Arrays.toString(m.getParameterTypes()));
        }
    }
}