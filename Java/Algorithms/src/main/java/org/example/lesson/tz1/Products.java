package org.example.lesson.tz1;


interface Discountable {
  default void applyDiscount(double percentage) {

  }

}

public abstract class Products {
//  Создать абстрактный класс Product,
//  содержащий информацию о продукте (название, цена) и методы для получения информации.

  private String name;
  private double price;

  public Products(String name, double price) {
    this.name = name;
    this.price = price;

  }


  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}

class PhysicalProduct extends Products implements Discountable {
  private int delivery;
  public PhysicalProduct(String name, double price, int delivery) {
    super(name, price);
    this.delivery=delivery;
  }

  public int getDelivery() {
    return delivery;
  }
  //   Создать интерфейс Discountable, который имеет метод applyDiscount(double percentage)
//   для применения скидки к продукту.


}

class DigitalProduct extends Products implements Discountable {

  public DigitalProduct(String name, double price) {
    super(name, price);
  }
}