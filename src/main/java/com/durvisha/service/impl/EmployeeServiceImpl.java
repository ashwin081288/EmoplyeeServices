package com.durvisha.service.impl;

import com.durvisha.model.Employee;
import com.durvisha.model.Store;
import com.durvisha.repository.EmployeeRepository;
import com.durvisha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    @Qualifier("employeeRepository")
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeeList() {
List<Store> stores=employeeRepository.getStoreClientProxy().getBody();
        return Arrays.asList(Employee.builder().name("Ashwin").stores(stores).build());
    }
}
