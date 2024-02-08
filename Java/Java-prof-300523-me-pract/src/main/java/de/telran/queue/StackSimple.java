package de.telran.queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackSimple {
    public static void main(String[] args) {
        //LIFO
        Deque<Integer> queue = new LinkedList<>();//new ArrayDeque<>();

        System.out.println(queue.add(20));
        queue.addLast(30);
        queue.addLast(15);
        System.out.println(queue);

        System.out.println(queue.peekLast());
        System.out.println(queue.pollLast());
        System.out.println(queue.peekLast());
        System.out.println(queue.pollLast());//лучше использовать в связке с add
        System.out.println(queue.peekLast());
        System.out.println(queue.removeLast()); //лучше использовать в связке с addLast

        System.out.println(queue);
        System.out.println(queue.peekLast());
        System.out.println(queue.pollLast());

//        System.out.println(queue.removeLast());

    }
}
