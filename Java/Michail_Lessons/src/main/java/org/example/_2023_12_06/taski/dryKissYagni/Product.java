package org.example._2023_12_06.taski.dryKissYagni;

// Нарушение SOLID: Нарушение принципа единственной ответственности
public class Product {
    private String name;
    private double price;
    
    public void saveToDatabase() {
        // Сохранение товара в базу данных
    }
    
    public void generateInvoice() {
        // Генерация счета для товара
    }
    
    // Избыточный метод, который не связан с товаром
    public void sendEmailConfirmation() {
        // Отправка электронного письма с подтверждением
    }
}

// Исправлено:
// Разделили ответственность на сохранение товара и генерацию счета.
class ProductQ {
    private String name;
    private double price;
    
    public void saveToDatabase() {
        // Сохранение товара в базу данных
    }
}

class InvoiceQ {
    public void generateInvoice(Product product) {
        // Генерация счета для товара
    }
}
