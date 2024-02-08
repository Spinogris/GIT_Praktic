package de.telran.generic.simple.garbage;

import de.telran.generic.simple.home.Garbage;
import lombok.AllArgsConstructor;

public class GarbageHandlerImpl<T extends Garbage, S extends HandleMethod> implements GarbageHandler<T, S> {

    @Override
    public void handle(T what, S how) {
        System.out.println("Перерабатываем мусор "+what+" используя цикл переработки "+how);
    }

    @Override
    public <E> void transfer(E dangerousWaste) {
        System.out.println("Мы не можем переработаеть "+dangerousWaste+", поэтому перевозим ее на другое предприятие!");
    }

}
