package org.example._2023_09_25;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        List<Integer> listI = new LinkedList<>();
        listI.add(1);
        listI.add(21);
        listI.add(31);
        listI.add(15);
        listI.add(16);

        Set<Integer> set = new TreeSet<>();
        set.add(500);
        set.add(5);
        set.add(52);
        set.add(52);
        set.add(54);
        set.add(65);
        set.add(5);
        set.add(52);
        set.add(54);
        System.out.println(set);
    }
}
