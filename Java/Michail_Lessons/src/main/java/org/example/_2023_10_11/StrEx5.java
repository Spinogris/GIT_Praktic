package org.example._2023_10_11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StrEx5 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 2, 1, 6, 5, 4, 9, 9, 9, 9, 8, 7);
        List<String> strings = Arrays.asList("Mama", "myla", "ramu");

        //mapToInt -> IntStream
        int sum = list1.stream()
                .mapToInt(digit -> digit.intValue())
                .sum();

        int sum1 = strings.stream()
                .mapToInt(String::hashCode)
                .sum();

        List<Em> emList = Arrays.asList(
                new Em("L", "S", 2500),
                new Em("S", "D", 3500),
                new Em("Q", "H", 6500),
                new Em("E", "S", 500),
                new Em("V", "B", 6600),
                new Em("B", "Y", 3500),
                new Em("C", "M", 10000)
        );

        //groupingBy()
        Map<String, List<Em>> map = emList.stream()
                .collect(Collectors.groupingBy(emp -> {
                    if(emp.getSalary() <= 5000) {
                        return "LOW";
                    } else if (emp.getSalary() <= 10000) {
                        return "High";
                    } else return "Medium";
                }));
        System.out.println(map);

        List<String> stringList = strings.stream()
                .flatMap(word-> Arrays.stream(word.split("")))
                .toList();
        System.out.println(stringList);
    }
}

class Em {
    private String firstName;
    private String lastName;
    private int salary;

    public Em(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Em{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
