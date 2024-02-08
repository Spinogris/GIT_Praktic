package org.example._2023_11_27;
//todo сделать так что бы выводило какой официант какое блюдо забрал
public class Restaurant {
    private boolean isReady = false;

    public synchronized void cookDish() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("Cooking...... ... .");
        isReady = true;
        notifyAll();
    }

    public synchronized void takeDish() throws InterruptedException {
        while (!isReady) {
            wait();
        }

        Thread.sleep(500);
        System.out.println("**Waiter is working**");
        isReady = false;
    }
}


class Cook extends Thread {
    private Restaurant restaurant;

    public Cook(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            restaurant.cookDish();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Waiter extends Thread {
    private Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                restaurant.takeDish();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cook cook = new Cook(restaurant);

        Waiter w1 = new Waiter(restaurant);
        Waiter w2 = new Waiter(restaurant);

        cook.start();
        w1.start();
        w2.start();
    }
}