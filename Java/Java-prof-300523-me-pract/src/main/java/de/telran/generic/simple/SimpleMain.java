package de.telran.generic.simple;

import de.telran.generic.simple.garbage.*;
import de.telran.generic.simple.home.*;

import java.util.ArrayList;
import java.util.List;

public class SimpleMain {
    public static void main(String[] args) {
        Box<Paper> boxForPaper = new Box<>(new Paper());
        System.out.println(boxForPaper);

        Box<Plastic> boxForPlastic = new Box<>(new Plastic());
        System.out.println(boxForPlastic);

        Box<Glass> boxForGlass = new Box<>(new Glass());
        System.out.println(boxForGlass + " весом "+boxForGlass.getItemWeight());


        TwoCellsBox<Paper, Plastic> boxForPaperUndPlastic = new TwoCellsBox<>(new Paper(), new Plastic());
        System.out.println(boxForPaperUndPlastic);

        TwoCellsBox<Plastic, Glass> boxForPlasticUndGlass = new TwoCellsBox<>(new Plastic(), new Glass());
        System.out.println(boxForPlasticUndGlass);

        //  - Переработка интерфейсы
        GarbageHandlerImpl garbageHandlerPaper = new GarbageHandlerImpl();
        garbageHandlerPaper.handle(new Paper(), new PaperHandleMethod());

        garbageHandlerPaper.transfer(new Glass());

        List<?> example1 = new ArrayList<Paper>();
        List<? extends Garbage> example2 = new ArrayList<Paper>();
        List<? super Garbage> example3 = new ArrayList<Garbage>();

    }
}
