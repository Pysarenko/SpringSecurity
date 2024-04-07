package com.cath.springboot.cruddemo4section.dao;

import com.cath.springboot.cruddemo4section.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
