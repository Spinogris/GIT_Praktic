package org.example._2023_09_11.prac;

public class Company {
    private String name;
    private Department[] departments = {
            new Department("Dep1", 01),
            new Department("Dep2", 02),
            new Department("Dep3", 03),
            new Department("Dep4", 04)

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] department) {
        this.departments = department;
    }
}