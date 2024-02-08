package de.telran.queue;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable {
    private String name;
    private int age;

    @Override
    public int compareTo(Object o) {
        return this.age - ((Person)o).age;
    }
}
