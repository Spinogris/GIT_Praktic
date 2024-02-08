package org.example._20_11_23;

public class MT2 {
  public static void main(String[] args) {
    Thread th1 = new Thread(new THR1());
    Thread th2 = new Thread(new THR2()     );

  }
}

class THR1 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("= " + i + " |");
    }
  }
}

class THR2 implements Runnable {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println("& " + i + "<>");
    }
  }
}