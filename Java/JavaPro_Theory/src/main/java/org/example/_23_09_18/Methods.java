package org.example._23_09_18;

import java.util.*;
import java.util.Map;

public class Methods {
  // Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
  public int medium() {
    HashMap<Integer, String> mediumHashMap = new HashMap<>();
    mediumHashMap.put(0, "qweerty");
    mediumHashMap.put(1, "qweerty");
    mediumHashMap.put(2, "qweerty");
    mediumHashMap.put(3, "qweerty");
    mediumHashMap.put(4, "qweerty");
    mediumHashMap.put(5, "qweerty");

    int sum = 0;
    for (Integer i : mediumHashMap.keySet()) {
      sum += i;
    }
    int fsum = sum / mediumHashMap.size();
    return fsum;
  }

//  Переберите HashMap и найдите ключ с максимальным значением.

  public int maximalValueKey() {
    HashMap<Integer, String> maximal = new HashMap<>();
    maximal.put(1, "qwerty");
    maximal.put(2, "bu-ga-ga");
    maximal.put(3, "tro-lo-lo");
    maximal.put(4, "XA-XA-XA");
    maximal.put(5, "Finita la kamedia");

    int max = 0;
    for (Map.Entry<Integer, String> i : maximal.entrySet()) {
      int m = i.getKey();
      if (m > max) {
        max = m;
      }
    }
    return max;
  }

//  Переберите TreeMap и найдите ключ с минимальным значением.

  public int minimalValueKey() {
    TreeMap<Integer, String> minimal = new TreeMap<>();
    minimal.put(1, "qwerty");
    minimal.put(2, "bu-ga-ga");
    minimal.put(3, "tro-lo-lo");
    minimal.put(4, "XA-XA-XA");
    minimal.put(5, "Finita la kamedia");

    int min = minimal.firstKey();
    for (Map.Entry<Integer, String> i : minimal.entrySet()) {
      if (i.getKey() < min) {
        min = i.getKey();
      }
    }
    return min;
  }

//  Переберите HashMap и удалите все элементы с четными значениями.

  public HashMap<Integer, String> evenDeleted() {
    HashMap<Integer, String> even = new HashMap<>();
    even.put(10, "qwerty");
    even.put(20, "bu-ga-ga");
    even.put(30, "tro-lo-lo");
    even.put(40, "XA-XA-XA");
    even.put(50, "Finita la kamedia");

    String[] keys = {even.get(1), even.get(2), even.get(3), even.get(4), even.get(5)};
    System.out.println(Arrays.toString(keys));
//    for (Map.Entry<Integer, String> i : even.entrySet()) {
    for (int i = 0; i < keys.length; i++) {
      if (i % 2 == 0){
        even.remove(i);
      }
    }
    return even;
  }

}

