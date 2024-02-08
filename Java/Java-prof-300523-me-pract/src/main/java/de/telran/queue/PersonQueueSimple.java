package de.telran.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PersonQueueSimple {
    public static void main(String[] args) {
        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();
        personPriorityQueue.add(new Person("Вася", 18));
        personPriorityQueue.add(new Person("Петя", 33));
        personPriorityQueue.add(new Person("Дуня", 15));
        System.out.println(personPriorityQueue);

        System.out.println(personPriorityQueue.poll());
        System.out.println(personPriorityQueue);

        // меняю логику на обратную сортировку по старшинству возраста
        PriorityQueue<Person> personPriorityQueue1 = new PriorityQueue<>(
                ((o1, o2) -> {
                    int ageDiv = o2.getAge() - o1.getAge();
                    return ageDiv;
                })
        );
        personPriorityQueue1.add(new Person("Вася", 18));
        personPriorityQueue1.add(new Person("Петя", 33));
        personPriorityQueue1.add(new Person("Дуня", 15));
        System.out.println(personPriorityQueue1);


        PriorityQueue<Person> personPriorityQueue2 = new PriorityQueue<>(
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
                    }
                }
        );

        personPriorityQueue2.add(new Person("Вася", 18));
        personPriorityQueue2.add(new Person("Петя", 33));
        personPriorityQueue2.add(new Person("Дуня", 15));
        System.out.println(personPriorityQueue2);

        Person p1 = personPriorityQueue2.poll();
        System.out.println(personPriorityQueue2);

        PriorityQueue<Person> personPriorityQueue3 = new PriorityQueue<>(
                ((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2.getName(), o1.getName())));

        personPriorityQueue3.add(new Person("Вася", 18));
        personPriorityQueue3.add(new Person("Петя", 33));
        personPriorityQueue3.add(new Person("Дуня", 15));
        personPriorityQueue3.add(new Person("Федор", 25));
        System.out.println(personPriorityQueue3);

        p1 = personPriorityQueue3.poll();
        System.out.println(personPriorityQueue3);

    }
}
