package com.cath.springboot.cruddemo4section.dao;

import com.cath.springboot.cruddemo4section.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
