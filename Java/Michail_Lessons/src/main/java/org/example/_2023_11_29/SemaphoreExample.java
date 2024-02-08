package org.example._2023_11_29;

import com.github.javafaker.Faker;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private final static Faker FAKER = new Faker();

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
    }
}

class Person extends Thread {
    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("[" + name + "] is waiting for,,,,,,,,");
            sleep(300);
            semaphore.acquire();
            sleep(2500);
            System.out.println("[" + name + "] is using the PhoneBox");
            sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
            System.out.println("[" + name + "] OUT");
        }
    }
}