package de.telran.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueSimple {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return java.lang.Integer.compare((int)o2, (int)o1);
                    }
                }
        );
        priorityQueue.add(17);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(22);
        priorityQueue.offer(11);
        priorityQueue.offer(21);
        System.out.println(priorityQueue);

        int el = priorityQueue.peek();
        System.out.println(el);
        System.out.println(priorityQueue);

        el = priorityQueue.poll();
        System.out.println(el);
        System.out.println(priorityQueue);

        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(
                ((o1, o2) -> o1 - o2)
        );

        priorityQueue1.add(17);
        priorityQueue1.add(20);
        priorityQueue1.add(9);

        System.out.println(priorityQueue1);

    }
}

class NewCompareInt<Integer> implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return java.lang.Integer.compare((int)o2, (int)o1);
    }
}