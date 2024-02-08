package de.telran.generic.simple.home;

public class Box<T extends Garbage> { // обозначение типа - T
    // переменная с типом T
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public void putItem(T item) { //параметр метода типа T
        this.item = item;
    }

    public T getItem() { // возвращает объект типа T
        return item;
    }

    public double getItemWeight() {
        // не скомпилируется
        return item == null ? 0 : item.getWeight();
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                ", item.class=" + item.getClass().getName() +
                '}';
    }
}