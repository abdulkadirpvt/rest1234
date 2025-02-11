package com.rest.controller;

import com.rest.model.Employee;
import com.rest.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp service;

    @GetMapping
    public String getLogin(){
        return "Hello World";
    }

    @PostMapping("add")
    public Employee addEmployeesssss(@RequestBody Employee employee){
        return this.service.addEmployee(employee);
    }

    @GetMapping("all")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployees();
    }
}
