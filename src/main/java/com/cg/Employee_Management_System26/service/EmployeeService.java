package com.cg.Employee_Management_System26.service;

import java.util.List;
import com.cg.Employee_Management_System26.entity.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee emp);
    void deleteEmployee(Long id);
}