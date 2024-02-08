package org.example._2023_12_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleRunnable {
    /**
     * Runnable
     * Thread
     * Callable
     */


    static int fResult;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialRun factorial = new FactorialRun(5);

        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(6, TimeUnit.SECONDS);

        System.out.println(fResult);
    }
}

class FactorialRun implements Runnable {
    int f;

    public FactorialRun(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f < 0) {
            System.out.println("Incorrect volume");
            return;
        }

        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        ExampleRunnable.fResult = result;
    }
}
