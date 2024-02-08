package org.example._2023_12_04;

import java.util.concurrent.locks.ReentrantLock;

public class COWAL {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();

    public COWAL(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        lock.lock();
        balance = balance + amount;
        lock.unlock();
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            balance = balance - amount;
        } finally {
            lock.unlock();
        }
    }
}