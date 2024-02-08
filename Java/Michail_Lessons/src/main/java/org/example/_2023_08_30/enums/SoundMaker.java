package org.example._2023_08_30.enums;

/**
 * Интерфейсы: Перечисления могут реализовывать
 * интерфейсы, позволяя вам создавать более сложные
 * иерархии классов.
 */
interface SoundMaker {
    String makeSound();
}

enum Animal1 implements SoundMaker {
    DOG {
        @Override
        public String makeSound() {
            return "Woof";
        }
    },
    CAT {
        @Override
        public String makeSound() {
            return "Meow";
        }
    },
    // ...
}
