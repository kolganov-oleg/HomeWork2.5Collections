package com.example.homework2_5collections.service;

import com.example.homework2_5collections.model.Employee;

import java.util.List;

public interface DepartmentService {
    Employee getLowestPaidEmployee(int department);

    Employee getHighestPaidEmployee(int department);

    List<Employee> printEmployeesForDepartment(int department);

    List<Employee> printEmployeesByDepartments();
}