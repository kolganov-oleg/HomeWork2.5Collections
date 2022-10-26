package com.example.homework2_5collections.service;

import com.example.homework2_5collections.model.Employee;

import java.util.Collection;
import java.util.List;

;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int salary, int department);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Employee getMaxSalary(int department);

    Employee getMinSalary(int department);

    List<Employee> getAllEmployeeInDepartment(int department);

    List<Employee> getAllEmployeeMultipleDepartment();

    Collection<Employee> findAll();
    List<Employee> getEmployees();
    Employee addEmployee(String firstName, String lastName, int salary, int department);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
}