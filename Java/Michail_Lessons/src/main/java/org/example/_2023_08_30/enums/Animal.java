package org.example._2023_08_30.enums;

/**
 * Методы для каждого элемента перечисления:
 * Вы можете добавлять методы к каждому элементу
 * перечисления. Например, если у вас есть перечисление
 * Animal с элементами DOG, CAT и HORSE, вы можете добавить
 * метод makeSound() для каждого элемента.
 */
enum Animal {
    DOG {
        @Override
        String makeSound() {
            return "1200";
        }
    },
    CAT {
        @Override
        String makeSound() {
            return "1000";
        }
    },
    HORSE {
        @Override
        String makeSound() {
            return "1900";
        }
    };

    abstract String makeSound();
}

class TE {
    Animal animal;

    public TE(Animal animal) {
        this.animal = animal;
    }

    public static void main(String[] args) {
        TE te = new TE(Animal.DOG);
        te.animal.makeSound();
    }
}