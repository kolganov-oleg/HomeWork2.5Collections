package com.example.homework2_5collections.model;

public class Employee {
    private final int id;
    private String fullName;
    private int department;
    private double salary;
    private static int counter;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Работник " +
                " id = " + id +
                ", fullName = '" + fullName + '\'' +
                ", department = " + department +
                ", salary = " + salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
