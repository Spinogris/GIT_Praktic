package org.example._2023_08_30.enums;

/**
 * Структуры данных и методы: Вы можете создавать
 * структуры данных и методы, которые работают с перечислениями.
 */
class EnumUtil {
    public static <E extends Enum<E>> E getRandomEnum(Class<E> enumClass) {
        E[] enums = enumClass.getEnumConstants();
        return enums[(int) (Math.random() * enums.length)];
    }
}
