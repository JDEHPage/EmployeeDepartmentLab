package com.codeclan.example.EmployeeDepartmentLab.repositories;

import com.codeclan.example.EmployeeDepartmentLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
