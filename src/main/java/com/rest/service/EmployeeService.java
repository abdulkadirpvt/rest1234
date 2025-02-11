package com.rest.service;

import com.rest.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);
    public List<Employee> getAllEmployees();

}
