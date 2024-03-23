package com.cath.springboot.cruddemo4section.rest;

import com.cath.springboot.cruddemo4section.Service.EmployeeService;
import com.cath.springboot.cruddemo4section.dao.EmployeeDAO;
import com.cath.springboot.cruddemo4section.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    //constructor injection
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
