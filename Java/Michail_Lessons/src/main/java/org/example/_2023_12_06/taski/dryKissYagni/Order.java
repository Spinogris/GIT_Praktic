package org.example._2023_12_06.taski.dryKissYagni;//package PROF.dryKissYagni;
//
//// Нарушение SOLID: Нарушение принципа единственной ответственности
//public class Order {
//    private List<Item> items;
//
//    public void addItem(Item item) {
//        // Добавление товара
//    }
//
//    public void calculateTotal() {
//        // Вычисление общей стоимости заказа
//    }
//
//    public void printInvoice() {
//        // Печать счета
//    }
//}
//
//// Исправлено:
//// Создали отдельные классы для каждой ответственности.
//public class Order {
//    private List<Item> items;
//
//    public void addItem(Item item) {
//        // Добавление товара
//    }
//}