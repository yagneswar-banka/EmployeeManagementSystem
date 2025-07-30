package com.cg.Employee_Management_System26.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.Employee_Management_System26.entity.Employee;
import com.cg.Employee_Management_System26.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void saveEmployee(Employee emp) {
        repo.save(emp);
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
