package org.example._2023_11_13.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class empClass = Class.forName("org.example._2023_11_13.reflect.Emp");
        ////////////////////////////////////////////////////////////////////////////////

        Constructor<Emp> constructor1 = empClass.getConstructor(int.class, String.class, String.class);
      //  Emp emp = constructor1.newInstance();

        Constructor constructor2 = empClass.getConstructor(int.class, String.class, String.class);
        Object obj = constructor2.newInstance(11, "Mik", "IT");

      //  System.out.println(emp);
        System.out.println(obj);
        Method method = empClass.getMethod("setSalary", double.class);
    }
}
