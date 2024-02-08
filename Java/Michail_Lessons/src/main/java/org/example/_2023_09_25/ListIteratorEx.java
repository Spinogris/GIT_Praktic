package org.example._2023_09_25;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('S');
        list.add('W');
        list.add('Q');
        list.add('N');
        list.add('L');
        list.add('Y');

        System.out.println(list);

        ListIterator<Character> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("**********************************************");

        // C V N M
        ListIterator<Character> listReverseIterator = list.listIterator(list.size());
        while (listReverseIterator.hasPrevious()) {
            System.out.println(listReverseIterator.previous());
        }
    }
}