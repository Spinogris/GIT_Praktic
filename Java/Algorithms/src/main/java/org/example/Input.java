package org.example;

import java.util.Scanner;

public class Input {
  Scanner sc1 = new Scanner(System.in);

  public int getNumberCandy() {
    int a = 0;
    while (a < 1 || a >= 21) {
      System.out.println("Введите число от 10 до 20: ");
      if (sc1.hasNextInt()) {
        a = sc1.nextInt();
      } else {
        sc1.next();
        System.out.println("Вы ввели не валидное число!");
      }

    }
    System.out.println("Вы ввели " + a);
    return a;
  }
//--------------------------------------------------------------------------------------------

  public int getNumberStep() {
    int a = 0;
    while (a < 1 || a >= 6) {
      System.out.println("Введите шаг от 1 до 5: ");
      if (sc1.hasNextInt()) {
        a = sc1.nextInt();
        System.out.println("Шаг хода " + a);
      } else {
        sc1.next();
        System.out.println("Вы ввели не валидное число!");
      }

    }
//    System.out.println("Вы ввели " + a);
    return a;
  }
  //--------------------------------------------------------------------------------------------

  public int step () {
    byte step = 0;
    while (step){

    }
  }
}
