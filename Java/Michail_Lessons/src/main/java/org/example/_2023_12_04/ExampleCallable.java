package org.example._2023_12_04;

import java.util.concurrent.*;

public class ExampleCallable {
    static int fResult;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialCal factorialCal = new FactorialCal(5);

        Future<Integer> future = executorService.submit(factorialCal);
        fResult = future.get();
        executorService.shutdown();

        System.out.println(fResult);
    }
}

class FactorialCal implements Callable<Integer> {
    int f;

    public FactorialCal(int f) {
        this.f = f;
    }

    @Override
    public Integer call() {
        if (f < 0) {
            throw new IllegalArgumentException();
        }

        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}