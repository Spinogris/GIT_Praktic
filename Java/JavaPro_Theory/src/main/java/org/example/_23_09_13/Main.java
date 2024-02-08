package org.example._23_09_13;

import java.util.ArrayList;
import java.util.List;

public class Main {


  public static void main(String[] args) {

//  5.5 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    ArrayList<Integer> employees = new ArrayList<>();
    employees.add(10);
    employees.add(134);
    employees.add(16);
    employees.add(105);

    System.out.println(employees);

    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(555);

    System.out.println(list);

    int e = new Hw().maximalElem();
    System.out.println(e);

    int w = new Hw().letter();
    System.out.println(w);

    int firsEntWord = new Hw().firstEntryWord();
    System.out.println(firsEntWord);


    Object q = new Hw().delElem();

    System.out.println(q);

    ArrayList<Integer> r = new Hw().even();
    System.out.println(r);

       System.out.println(new Hw().multiple());

  }
}

