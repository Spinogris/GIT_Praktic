package org.example._2023_11_29;

import com.github.javafaker.Faker;

import java.util.concurrent.CountDownLatch;

public class CDL {
    static Faker faker = new Faker();
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void turnON() throws InterruptedException {
        Thread.sleep(800);
        System.out.println("Power is on");
        countDownLatch.countDown();
        System.out.println("CDL: [" + countDownLatch.getCount() + "]");
    }

    public static void uploadDATA() throws InterruptedException {
        Thread.sleep(1800);
        System.out.println("DATA was upload");
        countDownLatch.countDown();
        System.out.println("CDL: [" + countDownLatch.getCount() + "]");
    }

    public static void showGUI() throws InterruptedException {
        Thread.sleep(2800);
        System.out.println("System ready to work");
        countDownLatch.countDown();
        System.out.println("CDL: [" + countDownLatch.getCount() + "]");
    }

    public static void main(String[] args) {
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);
        new ITUser(faker.name().name(), countDownLatch);


        try {
            turnON();
            uploadDATA();
            showGUI();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ITUser extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public ITUser(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println("***User: " + name + " has started to work***");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}