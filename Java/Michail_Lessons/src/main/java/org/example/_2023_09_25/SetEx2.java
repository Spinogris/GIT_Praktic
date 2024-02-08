package org.example._2023_09_25;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Ob o1 = new Ob("A", 22);
        Ob o2 = new Ob("A", 22);
        Ob o3 = new Ob("B", 35);
        Ob o4 = new Ob("C", 34);
        Ob o5 = new Ob("C", 45);
        Ob o6 = new Ob("B", 40);

        Set<Ob> obs = new HashSet<>();
        obs.add(o1);
        obs.add(o2);
        obs.add(o3);
        obs.add(o4);
        obs.add(o5);
        obs.add(o6);
        System.out.println(obs);

    }
}

class Ob implements Comparable<Ob> {
    String name;
    int age;

    public Ob(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Ob o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ob)) return false;
        Ob ob = (Ob) o;
        return Objects.equals(name, ob.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Ob{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}