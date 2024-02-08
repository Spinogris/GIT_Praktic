package org.example;

import java.util.Arrays;
import java.util.Random;


public class Methods {

  public static Pair Massiv() {

//    Создайте массив из 8 случайных целых чисел из интервала [1;50]
//    Выведите массив на консоль в строку.
//    Замените каждый элемент с нечетным индексом на ноль.
//    Снова выведете массив на консоль в отдельной строке.

    int[] arr = new int[10];                                    // создал смассив с 10-ю элементами
    int[] arr2 = new int[10];                                   // создал смассив2 с 10-ю элементами
    Random n = new Random();                                    // инициализировал рандом

    for (int i = 0; i < arr.length & i < arr2.length; i++) {    //  прошёл циклом по массиву
      int z = n.nextInt(1, 50);                     // рандомное число 1-50
      arr[i] = z;                                               //  присвоив каждому элементу
      arr2[i] = z;                                              //  присвоив каждому элементу
      if ((i + 1) % 2 != 0) {                                   //  проверка на чётность
        arr2[i] = 0;                                            //  нечётным присваиваем 0
      }
    }
    var p = new Pair(); // выделили память для М1 и М2
    p.m1 = Arrays.toString(arr); // з
    p.m2 = Arrays.toString(arr2);
    return p;    // поглядим =)

  }


//-----------------------------------------------------------------------------

  public static int[] strictArray() {
//    Создайте массив из 5 случайных целых чисел из интервала [10;99]
//    Выведите его на консоль в строку.
//    Определите и выведите на экран сообщение о том,
//    является ли массив строго возрастающей последовательностью.
    int[] arr = new int[5];
    Random r = new Random();

    for (int i = 0; i < arr.length; i++) {
      arr[i] = r.nextInt(10, 100);
    }
    return arr;

  }

  public static String growing(int[] lol) {
    int val = 0;
    for (int i = 0; i < lol.length; i++) {
      if (lol[i] < val) {
        String neg = "Массив не является строго возрастающей последовательностью";
        return neg;
      }
      val = lol[i];
    }
    String pos = "Массив является строго возрастающей последовательностью";
    return pos;
  }


}

class Pair {
  public String m1;
  public String m2;
}