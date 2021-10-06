package com.juanchaparro.DynamoDB.SpringBoot.Demo.controller;

import com.juanchaparro.DynamoDB.SpringBoot.Demo.entity.Employee;
import com.juanchaparro.DynamoDB.SpringBoot.Demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeRepository.getEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        return employeeRepository.delete(id);
    }

    @PutMapping("/employee/{id}")
    public String updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        return employeeRepository.update(id, employee);
    }

}
