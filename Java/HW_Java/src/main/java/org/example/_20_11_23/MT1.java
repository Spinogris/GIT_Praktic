package org.example._20_11_23;

public class MT1 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("MAIN START");
    TH1 th1 = new TH1();
    TH2 th2 = new TH2();

    th1.getPriority();
    th2.getPriority();

    System.out.println("MAIN 1: " + th1.getName() + "\n                 Priority - " + th1.getPriority());
    System.out.println("MAIN 2: " + th2.getName() + "\n                 Priority - " + th2.getPriority());

    th1.start();
    th2.start();

    th1.join();
    th2.join();

    System.out.println("MAIN START");
  }
}

class TH1 extends Thread {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println("!" + i + "***");
    }
  }
}

class TH2 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("?" + i + "$$$$$");
    }
  }
}
