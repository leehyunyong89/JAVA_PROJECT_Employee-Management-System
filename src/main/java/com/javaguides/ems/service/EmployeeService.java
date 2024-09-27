package com.javaguides.ems.service;

import com.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee (EmployeeDto employeeDto);

    EmployeeDto getEmployeeById (Long employeeId);

    List<EmployeeDto> getAllEmployees();
}
