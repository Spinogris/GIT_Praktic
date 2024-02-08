package org.example;

public clas s Human {
  /*
Задача
Сделать класс для вывода данных в финтес клубе.
1) Для одного экрана данные только по имени и весу
2) Для другого данные по балансу финансов, возрасту и имени
Для третьего все данные по объекту
 */
  public class Human {
    // Поля класса - свойства сущности
    private String name;
    private double weight;
    private double balance;
    private int age;

    // Полиморфизм объектов
    /**Пустой конструктор, если конструкторы не указаны, то будет по умолчанию вызваться он
     */
    public Human() {
    }
    /** Конструктор для первой задачи
     * @param name имя
     * @param weight вес
     */
    public Human(String name, double weight) {     // Создаем объект для тренера
      this.name = name;
      this.weight = weight;
      System.out.println("Имя: " + name + " Вес:" + weight);   // Трассировка
    }
    /**
     * Конструктор для второй задачи
     * @param name имя
     * @param balance финансовый баланс
     * @param age возраст
     */
    public Human(String name, double balance, int age) {  // Создаем объект для бухгалтера
      this.name = name;
      this.balance = balance;
      this.age = age;
      System.out.println("Имя: " + name + " Баланс: " + balance + " Возраст: " + age);
    }
  }
}
