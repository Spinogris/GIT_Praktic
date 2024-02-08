package de.telran.lesson20230915;

import de.telran.lesson20230908.Human;

public class TestEquals {

    public static void main(String[] args) {

        Human human3 = null;
        someMethod(human3);

        Human human1 = new Human("Tom");
        Human human2 = new Human("Tom");

        System.out.println(human1.equals(human2));
        System.out.println(human1 == human2);
    }

    private static void someMethod(Human human3) {
        if (human3 != null) {
            human3.play();
        } else {
            human3 = new Human("Default object");
            human3.play();
        }
    }


}
