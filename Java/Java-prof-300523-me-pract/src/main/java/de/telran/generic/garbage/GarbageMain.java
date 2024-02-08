package de.telran.generic.garbage;

import de.telran.generic.garbage.recycle.GarbageHandler;
import de.telran.generic.garbage.recycle.GarbageHandlerImplPaper;
import de.telran.generic.garbage.recycle.PaperHandleMethod;
import de.telran.generic.garbage.recycle.PlasticHandleMethod;

import java.util.ArrayList;
import java.util.List;

public class GarbageMain {
    public static void main(String[] args) {
        Box<Paper> paperBox = new Box<>(new Paper());
        System.out.println(paperBox);

        Box<Plastic> plasticBox = new Box<>(new Plastic());
        System.out.println(plasticBox);

        Box<Glass> glassBox = new Box<>(new Glass());
        System.out.println(glassBox);

        Box box = new Box(); //raw type
        System.out.println(box);

        TwoCellsBox<Paper, Plastic> twoCellsBox = new TwoCellsBox<>(new Paper(), new Plastic());
        System.out.println(twoCellsBox);

        GarbageHandler<Paper, PaperHandleMethod> garbageHandlerPaper = new GarbageHandlerImplPaper<>();
        garbageHandlerPaper.handle(new Paper(), new PaperHandleMethod());
        garbageHandlerPaper.transfer(new Glass());

        GarbageHandler<Plastic, PlasticHandleMethod> garbageHandlerPlastic = new GarbageHandlerImplPaper<>();
        garbageHandlerPlastic.handle(new Plastic(), new PlasticHandleMethod());

        List<? extends Garbage> listExtend = new ArrayList<Paper>();
        List<? super Garbage> listSuper = new ArrayList<>();

        List list = new ArrayList<>();
        List<?> list1 = new ArrayList<Integer>();

    }
}
