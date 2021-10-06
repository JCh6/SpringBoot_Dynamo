package com.juanchaparro.DynamoDB.SpringBoot.Demo.controller;

import com.juanchaparro.DynamoDB.SpringBoot.Demo.entity.Employee;
import com.juanchaparro.DynamoDB.SpringBoot.Demo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable String employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable String employeeId) {
        return employeeRepository.delete(employeeId);
    }

    @PutMapping("/employee/{id}")
    public String updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
        return employeeRepository.update(employeeId, employee);
    }

}
