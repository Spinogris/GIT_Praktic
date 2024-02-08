package org.example._2023_10_09;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("M");
        if(optionalName.isPresent()) {
            String name = optionalName.get();
        } else {
            System.out.println();
        }
    }
}
