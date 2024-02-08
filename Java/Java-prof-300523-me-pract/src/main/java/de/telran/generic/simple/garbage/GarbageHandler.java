package de.telran.generic.simple.garbage;

import de.telran.generic.simple.home.Garbage;

interface GarbageHandler<T extends Garbage, S extends HandleMethod> {
//    interface GarbageHandler<T, S> {
    void handle(T what, S how);

    <E> void transfer(E dangerousWaste);
}