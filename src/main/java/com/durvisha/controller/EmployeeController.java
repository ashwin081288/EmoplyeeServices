package com.durvisha.controller;

import com.durvisha.model.Employee;
import com.durvisha.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class EmployeeController {
    @Autowired
    @Qualifier("employeeService")
    private EmployeeService employeeService;

    @GetMapping(value = "/employee")
//, consumes = MediaType.APPLICATION_JSON_VALUE
    public ResponseEntity<List<Employee>> getEmployeeList() {

        return ResponseEntity.ok(employeeService.getEmployeeList());
    }
}
