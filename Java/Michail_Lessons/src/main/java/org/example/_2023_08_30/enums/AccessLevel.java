package org.example._2023_08_30.enums;

import lombok.Getter;

public enum AccessLevel {
    LOW,
    MEDIUM,
    HIGH
}

class Employee {
    private String name;
    private Department department;
    private AccessLevel accessLevel;

    public Employee(String name, Department department, AccessLevel accessLevel) {
        this.name = name;
        this.department = department;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }
}