package org.example._2023_09_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TaskManager {
    public static void main(String[] args) {
        Random random = new Random();
        Map<String, Integer> map = new HashMap<>();
        map.put("Valdislav", random.nextInt(6));
        map.put("Tatiana", random.nextInt(6));
        map.put("Vasily", random.nextInt(6));
        map.put("Bogdan", random.nextInt(6));
        map.put("Ivan", random.nextInt(6));
        map.put("Viktor", random.nextInt(6));
        map.put("Olexander", random.nextInt(6));
        map.put("Walter", random.nextInt(6));
        map.put("Dmitry", random.nextInt(6));
        map.put("Ruslan", random.nextInt(6));
        map.put("Batyr", random.nextInt(6));
        map.put("Lidiya", random.nextInt(6));
        map.put("Alexey", random.nextInt(6));

        System.out.println(map);

        /*
         *{Walter=2,
         * Dmitry=4,
         * Batyr=3,
         * Vasily=1,
         * Viktor=3,
         * Valdislav=5,
         * Lidiya=3,
         * Olexander=1,
         * Tatiana=3,
         * Ivan=5,
         * Bogdan=3,
         * Ruslan=3,
         * Alexey=1}
         * 10.00-11.15
         */
    }
}
