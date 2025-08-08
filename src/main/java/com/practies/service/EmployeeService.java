package com.practies.service;

import com.practies.entity.Employee;
import com.practies.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }
    public Employee saveEmployee( Employee employee){
       return employeeRepository.save(employee);
    }

}
