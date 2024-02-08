package org.example;
/**
 * Класс калькулятор для целых чисел
 * @author Vlad
 * @date 25.08.23
 * @version 1
 */
public class Calculator {

    /**
     * Метод для суммирования чисел
     * @param a первое число
     * @param b второе число
     * @return сумма
     */
    public int sum(int a, int b){
        return a+b;
    }
    /**
     * Метод для вычитания чисел
     * @param a число, из которого вычитаем
     * @param b число, которое вычитаем
     * @return разность
     */
    public int sub(int a, int b){
        return a-b;
    }

    /**
     * Метод для умножения чисел
     * @param a первое число
     * @param b второе число
     * @return произведение
     */
    public int mul(int a, int b){
        return a*b;
    }

    /**
     * Метод для деления чисел
     * @param a делимое число
     * @param b делитель
     * @return частное(результат деления)
     */
    public double div(int a, int b){     // TODO Совет замените double на int, уберите внизу приведение к double и в главной конфигурации выполните деление 5 на 2. Объясните почему получен такой результат
        return (double)a/(double)b;      // Проводим явное привидение типов к double, чтобы избежать потери дробной части
    }

    @Override       // Переопределяем метод toString класса Object
    public String toString() {
        return "Объект класса Calculator";
    }


}
