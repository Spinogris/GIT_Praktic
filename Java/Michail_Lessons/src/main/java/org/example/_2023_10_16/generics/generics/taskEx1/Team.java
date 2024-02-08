package org.example._2023_10_16.generics.generics.taskEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @param <T> type
 *
 */
public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();
    private static final Random RANDOM = new Random(); //private static final - CAPS LOCK!

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T newParticipant) {
        participants.add(newParticipant);
        System.out.println("New participant was added to the team: " + name);
    }

    /**
     * Team t1 = new Team(a);
     * Team t2 = new Team(b);
     * t1.play(t2)
     *
     */
    public void play(Team<T> team) {
        String winner;
        int r = RANDOM.nextInt(2);
        if(r == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println("WINNER NAME: " + winner);
    }
}