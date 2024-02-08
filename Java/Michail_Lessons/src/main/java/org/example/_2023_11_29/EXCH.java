package org.example._2023_11_29;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * - Создать класс для генерации игроков (50 шт)
 * - Создать класс для генерации листа Position(10 раз)
 * - Все игроки должны сыграть "каждый с каждым"
 * - Если победа то +1 если поражение то -1 ничья 0,5
 * - Составить таблицу игроков и вывести на экран тройку лидеров
 * - Если у тройки лидеров одинаковые очки - они переигрывают ТО кол-во раз пока кол-во очков не станет разным.
 *
 * - CDL для генерации игроков.
 */
public class EXCH {
    private final static Faker FAKER = new Faker();

    public static void main(String[] args) {
        Exchanger<Position> exchanger = new Exchanger<>();

        List<Position> mainPlayerList = new ArrayList<>();
        mainPlayerList.add(Position.SCISSORS);
        mainPlayerList.add(Position.STONE);
        mainPlayerList.add(Position.SCISSORS);
        mainPlayerList.add(Position.PAPER);
        mainPlayerList.add(Position.SCISSORS);

        List<Position> anotherPlayerList = new ArrayList<>();
        anotherPlayerList.add(Position.STONE);
        anotherPlayerList.add(Position.PAPER);
        anotherPlayerList.add(Position.SCISSORS);
        anotherPlayerList.add(Position.STONE);
        anotherPlayerList.add(Position.PAPER);

        new Player(FAKER.name().name(), mainPlayerList, exchanger);
        new Player(FAKER.name().name(), anotherPlayerList, exchanger);
    }
}

enum Position {
    STONE, SCISSORS, PAPER
}

class Player extends Thread {
    private String name;
    private List<Position> positions;
    private Exchanger<Position> exchanger;

    public Player(String name, List<Position> positions, Exchanger<Position> exchanger) {
        this.name = name;
        this.positions = positions;
        this.exchanger = exchanger;
        this.start();
    }

    private void play(Position mainPlayer, Position anotherPlayer) {
        if(mainPlayer == Position.PAPER && anotherPlayer == Position.STONE ||
           mainPlayer == Position.STONE && anotherPlayer == Position.SCISSORS ||
           mainPlayer == Position.SCISSORS && anotherPlayer == Position.PAPER) {
            System.out.println("***[ " + name + " ]: WINNER!***");
        }
    }

    @Override
    public void run() {
        Position reply;
        for (Position p : positions) {
            try {
                reply = exchanger.exchange(p);
                play(p, reply);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
