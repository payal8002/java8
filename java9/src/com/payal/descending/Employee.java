package com.payal.descending;

public class Employee {
    private String name;
    private String gender;
    private int age;

    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee(name=" + name + ", gender=" + gender + ", age=" + age + ")";
    }
}


