package com.cg.Employee_Management_System26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.Employee_Management_System26.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
