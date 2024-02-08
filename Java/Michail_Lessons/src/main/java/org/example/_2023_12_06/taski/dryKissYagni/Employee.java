package org.example._2023_12_06.taski.dryKissYagni;

// Нарушение DRY: Дублирование кода
public class Employee {
    private String firstName;
    private String lastName;
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }
    
    // Дублирование кода формирования email
    public String getEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}

// Исправлено:
// Вынесли общую логику в отдельный метод.
class EmployeeQ {
    private String firstName;
    private String lastName;
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }
    
    public String getEmail() {
        return generateEmail(firstName, lastName);
    }
    
    private String generateEmail(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}
