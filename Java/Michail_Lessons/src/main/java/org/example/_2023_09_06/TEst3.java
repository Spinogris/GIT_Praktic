package org.example._2023_09_06;

public class TEst3 {
    public static void main(String[] args) {
        int a = 2;
        a++;
        System.out.println(a);

        char c = '*';
        c++;
        System.out.println(c);

        for (char i = 'a'; i < 'z'; i++) {

        }
    }
}

class Entity {
    void get() {

    }
}

interface RR {

}

class Inher extends Entity implements RR {
    public static void main(String[] args) {
        Entity rr = new Inher();
    }
}
