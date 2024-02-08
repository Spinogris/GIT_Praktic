package org.example._2023_11_22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TPool1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new PoolRun());
        }
        executorService.shutdown();
       // executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("MAIN END");
    }
}

class PoolRun implements Runnable {

    @Override
    public void run() {
        System.out.println("NAME: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}