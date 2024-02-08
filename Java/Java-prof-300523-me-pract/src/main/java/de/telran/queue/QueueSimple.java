package de.telran.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QueueSimple {
    public static void main(String[] args) {
        //FIFO
        Deque<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.add(20));
        queue.addLast(30);
        queue.addLast(15);
        queue.addLast(25);
        System.out.println(queue);


        System.out.println(queue.pop()); // лучше использовать в связке с addLast
        System.out.println(queue.poll()); // лучше использовать в связке с add
        System.out.println(queue.pop());

        System.out.println(queue);
        System.out.println(queue.poll());

    }
}
