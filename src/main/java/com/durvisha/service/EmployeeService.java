package com.durvisha.service;

import com.durvisha.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    public List<Employee> getEmployeeList();
}
