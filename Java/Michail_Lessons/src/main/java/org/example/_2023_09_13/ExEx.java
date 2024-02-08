package org.example._2023_09_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExEx {
  //Уровень сложности 5 из 10:

  //Найти сумму всех элементов ArrayList<Integer>.
  public int getSum(List<Integer> list) {
    int sum = 0;
    for (Integer integer : list) {
      sum = sum + integer;
    }
    return sum;
  }

  //Найти среднее значение элементов LinkedList<Integer>.
  public int getAverageNum(LinkedList<Integer> list) {
    int ave = 0;
    int aveFinal = 0;
    for (Integer i : list) {
      ave += i;
      aveFinal = ave / list.size();
    }
    return aveFinal;
  }

//  Перебрать ArrayList<String> и вывести все элементы на экран.

  public String getInputStringList(ArrayList<String> list) {
    String stringList = "";
    for (String integer : list) {
      stringList += integer;
    }
    return stringList;
  }

//    Перебрать LinkedList<String> и найти самую длинную строку.

  public String getLagestString(LinkedList<String> link) {
    String a = "";
    for (String s : link) {
      if (s.length() > a.length()) {
        a = s;
      }
    }
    return a;
  }

//  Создать ArrayList с объектами вашего собственного класса и вывести их на экран.


//  ExEx exEx1 = new ExEx();
//  ExEx exEx2 = new ExEx();
//  ExEx exEx3 = new ExEx();


  public void getExEx1() {

  List<ExEx>list = new ArrayList<>();

//    list.add(exEx1);
//    list.add(exEx2);
//    list.add(exEx3);

    // Выводим объекты на экран
    for (Object i : list) {
      System.out.println(i);
    }

  }
}
