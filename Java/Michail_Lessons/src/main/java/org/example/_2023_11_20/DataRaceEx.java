package org.example._2023_11_20;

public class DataRaceEx {
    public static void main(String[] args) {

        THDR thdr = new THDR();
        Thread t1 = new Thread(thdr);
        Thread t2 = new Thread(thdr);
        Thread t3 = new Thread(thdr);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter {
    static int count = 0;
}

class THDR implements Runnable {

    public static void incr() {

        synchronized (THDR.class) {
            Counter.count++;
        }

        System.out.print("Counter: " + Counter.count + " ");
        System.out.println("Name: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            incr();
        }
    }
}