package org.example._23_09_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hw {


  //Уровень сложности 5 из 10:
// 5.1 Найти сумму всех элементов ArrayList<Integer>.
  public int getSum(List<Integer> list) {
    int sum = 0;
    for (Integer integer : list) {
      sum = sum + integer;
    }
    return sum;
  }


  //  5.2 Найти среднее значение элементов LinkedList<Integer>.
  public int getAverageNum(LinkedList<Integer> list) {
    int ave = 0;
    int aveFinal = 0;
    for (Integer i : list) {
      ave += i;
      aveFinal = ave / list.size();
    }
    return aveFinal;
  }

//  5.3 Перебрать ArrayList<String> и вывести все элементы на экран.

  public String getLagestString(LinkedList<String> link) {
    String a = "";
    for (String s : link) {
      if (s.length() > a.length()) {
        a = s;
      }
    }
    return a;
  }

//   5.4 Перебрать LinkedList<String> и найти самую длинную строку.

  public String getInputStringList(ArrayList<String> list) {
    String stringList = "";
    for (String integer : list) stringList += integer;
    return stringList;
  }

//  Уровень сложности 6 из 10:
//  6.1 Перебрать ArrayList<Integer> и найти наименьший элемент.

  public int minimalElem(ArrayList<Integer> integers) {
    int i = 0;
    for (Integer a : integers) if (a < i) i = a;
    return i;
  }

//  6.2 Перебрать LinkedList<Integer> и найти наибольший элемент.

  public int maximalElem() {
    LinkedList<Integer> integers = new LinkedList<>();
    int i = 0;
    for (Integer a : integers) if (a > i) i = a;
    return i;
  }

//  6.3 Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.

  public int letter() {
    ArrayList<String> list = new ArrayList<>();
    list.add("city");
    list.add("since");
    list.add("ball");
    list.add("auto");
    list.add("cat");

    char letter = 'c';
    int count = 0;
    for (String s : list) {
      if (s.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
        count++;
      }
    }
    return count;
  }


//  6.4 Перебрать LinkedList<String> и найти первое вхождение определенной строки.

  public int firstEntryWord() {


    LinkedList<String> firstEntry = new LinkedList<>();
    firstEntry.add("auto");
    firstEntry.add("coffee");
    firstEntry.add("bike");
    firstEntry.add("Snowboard");
    firstEntry.add("roller");
    firstEntry.add("sky");
    firstEntry.add("apple");
    firstEntry.add("banana");
    firstEntry.add("tee");
    firstEntry.add("motor");
    firstEntry.add("table");

    String search = "sky";
    int entry = 0;
    for (int i = 0; i < firstEntry.size(); i++) {
      String str = firstEntry.get(i);
      if (str.equals(search)) {
        entry = i;
      }
    }
    return entry;
  }

//  6.5 Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.

  public Object delElem() {
    LinkedList<Integer> del = new LinkedList<>();
    del.add(1);
    del.add(2);
    del.add(3);
    del.add(1);
    del.add(2);
    del.add(3);
    del.add(1);
    del.add(2);
    del.add(3);
    del.add(1);
    del.add(2);
    del.add(3);


    for (int i = 0; i < del.size(); i++) {
      if (del.get(i).equals(1)) {
        del.remove(i);
      }
    }
    return del;
  }


//    Уровень сложности 7 из 10:
//  7.1 Перебрать ArrayList<Integer> и удалить все четные числа.

  public ArrayList<Integer> even() {
    ArrayList<Integer> ev = new ArrayList<>();
    ev.add(1);
    ev.add(2);
    ev.add(3);
    ev.add(4);
    ev.add(5);
    ev.add(6);
    ev.add(7);
    ev.add(8);

    Iterator<Integer> iterator = ev.iterator();
    while (iterator.hasNext()) {
      int num = iterator.next();
      if (num % 2 == 0) {
        iterator.remove();
      }
    }
    return ev;
  }

//  7.2 Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.

  public LinkedList<Integer> multiple() {
    LinkedList<Integer> mult = new LinkedList<>();
    mult.add(0);
    mult.add(1);
    mult.add(2);
    mult.add(3);
    mult.add(4);
    mult.add(5);
    mult.add(6);
    mult.add(7);
    mult.add(8);

    for (int i = 0; i < mult.size(); i++) {
      if (mult.get(i) % 3 == 0 && mult.get(i)!=0){
        mult.set(i, 0);
      }
    }
        return mult;
    }


//  7.3 Перебрать ArrayList<String> и объединить все элементы в одну строку.
//  7.4 Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
//  7.5 Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.

  }
