package org.example._2023_10_16.generics.generics.taskEx1;

import com.github.javafaker.Faker;

public class Main {
    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {
        System.out.println(FAKER.address().fullAddress());
        Schoolar p1 = new Schoolar(FAKER.name().name(), 10);
        Schoolar p2 = new Schoolar(FAKER.name().name(), 10);
        Schoolar p3 = new Schoolar(FAKER.name().name(), 8);
        Schoolar p4 = new Schoolar(FAKER.name().name(), 9);

        TeenAger t1 = new TeenAger(FAKER.name().name(), 18);
        TeenAger t2 = new TeenAger(FAKER.name().name(), 18);

        Adult a1 = new Adult(FAKER.name().name(), 35);
        Adult a2 = new Adult(FAKER.name().name(), 30);

        Team<Schoolar> scTeam1 = new Team<>(FAKER.team().name());
        Team<Schoolar> scTeam2 = new Team<>(FAKER.team().name());
        scTeam1.addNewParticipant(p1);
        scTeam1.addNewParticipant(p2);

        scTeam2.addNewParticipant(p3);
        scTeam2.addNewParticipant(p4);

        Team<TeenAger> tTeam1 = new Team<>(FAKER.team().name());
        tTeam1.addNewParticipant(t1);
        tTeam1.addNewParticipant(t2);

        scTeam1.play(scTeam2);
    }
}