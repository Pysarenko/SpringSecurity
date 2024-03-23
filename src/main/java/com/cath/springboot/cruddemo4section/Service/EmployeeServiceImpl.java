package com.cath.springboot.cruddemo4section.Service;

import com.cath.springboot.cruddemo4section.dao.EmployeeDAO;
import com.cath.springboot.cruddemo4section.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theemployeeDAO) {
        employeeDAO = theemployeeDAO;

    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
