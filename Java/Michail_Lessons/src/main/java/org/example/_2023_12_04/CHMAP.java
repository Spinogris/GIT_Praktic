package org.example._2023_12_04;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class CHMAP {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Mik");
        map.put(2, "Ni");
        map.put(3, "Ol");
        map.put(4, "Sv");
        map.put(5, "Ser");

        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println("RUN1 I: " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "CCC");
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map);

    }
}
