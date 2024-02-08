package org.example;

//Создайте 5 объектов типа Car
//Объект Car должен содержать поля
//private double price;
//private String model;
//и конструктор с этими полями
//Сохраните объекты в массив
//Распечатайте результат
//Результат печати одного авто должен выглядеть:
//Car - BMW, price = 2.3
//Применив метод “сортировка пузырьком” отсортируйте массив по стоимости
//Распечатайте результат
//Применив метод “сортировка пузырьком”
// отсортируйте массив по модели (первая буква из модели)
//Распечатайте результат
public class Car {
  private double price;
  private String model;

  public Car(double price, String model) {
    this.model = model;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public String getModel() {
    return model;
  }

  public String toString() {
    return "Car - " + model + ", price = " + price;
  }
}

class CarSorter {
  public static void sortByPrice(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      for (int k = 0; k < cars.length - i - 1; k++) {
        if (cars[k].getPrice() > cars[k + 1].getPrice()) {
          Car temp = cars[k];
          cars[k] = cars[k + 1];
          cars[k + 1] = temp;
        }
      }
    }
  }

  public static void sortByModel(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      for (int k = 0; k < cars.length - i - 1; k++) {
        if (cars[k].getModel().compareTo(cars[k + 1].getModel()) > 0) {
          Car temp = cars[k];
          cars[k] = cars[k + 1];
          cars[k + 1] = temp;
        }
      }
    }
  }
}

