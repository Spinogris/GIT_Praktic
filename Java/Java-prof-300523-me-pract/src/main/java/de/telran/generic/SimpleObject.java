package de.telran.generic;

import de.telran.lambda.Human;
import de.telran.queue.Person;

import java.util.ArrayList;
import java.util.List;

public class SimpleObject {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.add("Вася");

        List<? super Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Вася", 15));

        List listObj = new ArrayList<>();
        listObj.add("Вася");
        listObj.add(5);
        listObj.add(32.5);

        printList(listStr);

    }

    static <T> void printList(List<T> arList) {

        arList.stream()
                .forEach(System.out::println);
    }
}


