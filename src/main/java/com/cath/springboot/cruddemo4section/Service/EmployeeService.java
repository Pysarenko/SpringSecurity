package com.cath.springboot.cruddemo4section.Service;

import com.cath.springboot.cruddemo4section.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
