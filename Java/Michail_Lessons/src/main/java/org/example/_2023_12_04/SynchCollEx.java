package org.example._2023_12_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchCollEx {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> source = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 6; i++) {
            source.add(i);
        }

        List<Integer> target = new ArrayList<>();

        Runnable runnable = () -> {
            for (int i = 0; i < source.size(); i++) {
                target.add(source.get(i));
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(target);
    }
}
