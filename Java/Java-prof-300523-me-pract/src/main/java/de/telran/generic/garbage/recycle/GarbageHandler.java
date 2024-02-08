package de.telran.generic.garbage.recycle;

public interface GarbageHandler <T, S>{
    void handle(T what, S how);

    <E> void transfer(E dangerousWhat);
}
