package org.example._2023_12_06.taski.dryKissYagni;//package PROF.dryKissYagni;
//
//import java.util.List;
//
//public class DA {
//    // Нарушение DRY: Дублирование кода
//    public void processData(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size();
//        System.out.println("Average: " + average);
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = 0;
//        for (User user : users) {
//            //totalAge += user.getAge();
//        }
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }
//}
//
//// Исправлено:
//// Вынесли общую логику в отдельные методы.
//class DAQ {
//    public void processData(List<Integer> data) {
//        int sum = calculateSum(data);
//        System.out.println("Sum: " + sum);
//
//        double average = calculateAverage(data);
//        System.out.println("Average: " + average);
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = calculateTotalAge(users);
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = calculateAverageAge(users);
//        System.out.println("Average Age: " + averageAge);
//    }
//
//    private int calculateSum(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        return sum;
//    }
//
//    private double calculateAverage(List<Integer> data) {
//        return (double) calculateSum(data) / data.size();
//    }
//
//    private int calculateTotalAge(List<User> users) {
//        int totalAge = 0;
//        for (User user : users) {
//            //totalAge += user.getAge();
//        }
//        return totalAge;
//    }
//
//    private double calculateAverageAge(List<User> users) {
//        return (double) calculateTotalAge(users) / users.size();
//    }
//}