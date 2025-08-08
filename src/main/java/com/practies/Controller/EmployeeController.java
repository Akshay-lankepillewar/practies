package com.practies.Controller;


import com.practies.entity.Employee;
import com.practies.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
//    GET postman

    @GetMapping("/emp")
    public List<Employee> getAllEmployee() {
        return employeeService.getEmployee();
    }

    @PostMapping("/emp")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee saveEmp = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(saveEmp, HttpStatus.CREATED);
    }
}
