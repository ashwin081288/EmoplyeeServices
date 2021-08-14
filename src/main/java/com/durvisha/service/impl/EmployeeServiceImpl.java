package com.durvisha.service.impl;

import com.durvisha.model.Employee;
import com.durvisha.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployeeList() {
        return Arrays.asList(Employee.builder().message("csscss").build());
    }
}
