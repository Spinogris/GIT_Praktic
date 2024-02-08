package org.example._2023_11_22;

public class Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Start");
        IThread t1 = new IThread();

        t1.start();

        Thread.sleep(2000);

        t1.interrupt();
        t1.join();

        System.out.println("Main End");
    }
}

class IThread extends Thread {
    double digit = 0d;

    @Override
    public void run() {
        for (int i = 1; i < 1_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("***!***");
                return;
            }
            digit += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Zzz............");
                return;
            }
        }
        System.out.println(digit);
    }
}
