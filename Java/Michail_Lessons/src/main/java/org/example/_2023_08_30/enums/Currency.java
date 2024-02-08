package org.example._2023_08_30.enums;

/**
 * Конструкторы и поля: Вы можете добавлять поля
 * и конструкторы к каждому элементу перечисления.
 * Это позволяет устанавливать дополнительные атрибуты и
 * свойства для каждого элемента.
 */
enum Currency {
    USD("$"), EUR("€"), GBP("£");

    private final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
