package de.telran.generic.garbage.recycle;

import de.telran.generic.garbage.Paper;

public class GarbageHandlerImplPaper<T, S> implements GarbageHandler<T, S>{
    @Override
    public void handle(T what, S how) {
        System.out.println(what+" мы перерабатываем с помощью "+how);
    }

    @Override
    public <E> void transfer(E dangerousWhat) {
        System.out.println(dangerousWhat + " отправляем на другую переработку");
    }

}
