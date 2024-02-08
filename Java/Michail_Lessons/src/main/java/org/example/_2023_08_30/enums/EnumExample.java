package org.example._2023_08_30.enums;

public class EnumExample {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("Today is " + today);
        
        if (today == DayOfWeek.WEDNESDAY) {
            System.out.println("It's the middle of the week!");
        }


        /**
         * values(): Этот метод возвращает массив,
         * содержащий все элементы перечисления в
         * порядке их объявления.
         *
         */
        DayOfWeek[] days = DayOfWeek.values();

        /**
         * valueOf(String name): Этот метод возвращает
         * элемент перечисления с указанным именем. Имя
         * должно быть точным совпадением с именем элемента,
         * иначе будет выброшено исключение IllegalArgumentException.
         */
        DayOfWeek wednesday = DayOfWeek.valueOf("WEDNESDAY");

        /**
         * int ordinal = DayOfWeek.FRIDAY.ordinal(); // Вернет 4
         */
        int ordinal = DayOfWeek.FRIDAY.ordinal(); // Вернет 4

    }
}
