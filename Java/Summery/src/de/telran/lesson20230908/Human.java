package de.telran.lesson20230908;

public class Human implements Playable {

    private String name;

    private int age;

    private Dog dog;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Human " + name + " plays");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Human " + name + " plays with " + playable);
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
//        if (another.getClass().equals(Human.class)) {
        if (another instanceof Human) {
            Human anotherHuman = (Human) another;
//            double x = 1.4;
//            int y = (int) x;

            boolean nameCondition = (this.name == null && anotherHuman.name == null)
                    || (this.name != null) && this.name.equals(anotherHuman.name);
            boolean dogCondition = (this.dog == null && anotherHuman.dog == null)
                    || (this.dog != null) && this.dog.equals(anotherHuman.dog);

            if (nameCondition && dogCondition && this.age == anotherHuman.age) return true;
        }
        return false;
    }


}
