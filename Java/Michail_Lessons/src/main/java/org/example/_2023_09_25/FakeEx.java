package org.example._2023_09_25;

import com.github.javafaker.Faker;
import lombok.Getter;

@Getter
public class FakeEx {

    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 3; i++) {
            System.out.println(faker.address().country());
        }
    }
}