package org.example;

import java.util.Scanner;

public class methods {
  /**
   * Написать строку 10 раз
   *
   * @param str   строка
   * @param count количество раз
   */
  public static void lolo(String str, int count) {
    int i = 0;
    while (i < count) {
      System.out.println(str);
      i++;
    }
  }
//  -----------------------------------------------------------

  //  2.
// Сисадмин обнаружил, что его сообщения перехватываются и читаются в замке «Близнецы»,
// поэтому его атаки перестали быть внезапными. Немного подумав, он разработал программу,
// которая будет шифровать передаваемые сообщения по следующему алгоритму:
// программа получает на вход строку и меняет местами в ней каждые 2 подряд идущих символа.
// Если длина строки нечётная, то последний символ остаётся на своём месте.
//
//encrypt("move");   // "omev"
//encrypt("attack"); // "taatkc"
//encrypt("car!"); // "ac!r"
//
//// Если длина строки нечётная, то последний символ остаётся на своём месте
//encrypt("go!"); // "og!"

  /**
   * получает на вход строку и меняет местами в ней каждые 2 подряд идущих символа.
   *
   * @param str строка
   * @return меняет местами в ней каждые 2 подряд идущих символа
   */
  public static String twins(String str) {
    char[] mass = str.toCharArray();
    for (int i = 0; i < mass.length - 1; i = i + 2) {
      char rev = mass[i];
      mass[i] = mass[1 + i];
      mass[1 + i] = rev;
    }
    String newStr = String.copyValueOf(mass);
    return newStr;
  }
}

