package org.example._2023_08_30.enums;

/**
 * Добавление обычных методов: Вы можете
 * добавлять обычные методы к самому перечислению.
 * Эти методы могут быть вызваны как статические методы
 * на типе перечисления.
 */
enum Color {
    RED, GREEN, BLUE;

    public String getColorCode() {
        switch (this) {
            case RED:
                return "#FF0000";
            case GREEN:
                return "#00FF00";
            case BLUE:
                return "#0000FF";
            default:
                return "";
        }
    }
}