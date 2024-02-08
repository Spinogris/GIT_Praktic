package org.example._2023_12_06.taski.dryKissYagni;

// Нарушение SOLID: Нарушение принципа единственной ответственности
public class ProductService {
    public void addProduct(Product product) {
        // Добавление товара
    }
    
    public void updateProduct(Product product) {
        // Обновление товара
    }
    
    public void deleteProduct(Product product) {
        // Удаление товара
    }
    
    public double calculatePrice(Product product) {
        // Вычисление цены товара
        return 0;
    }
}

// Исправлено:
// Разбили методы на отдельные классы с разными ответственностями.
class ProductManagerQ {
    public void addProduct(Product product) {
        // Добавление товара
    }
    
    public void updateProduct(Product product) {
        // Обновление товара
    }
    
    public void deleteProduct(Product product) {
        // Удаление товара
    }
}

class PriceCalculatorQ {
    public double calculatePrice(Product product) {
        // Вычисление цены товара
        return 0;
    }
}
