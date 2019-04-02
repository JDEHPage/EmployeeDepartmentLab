package com.codeclan.example.EmployeeDepartmentLab.repositories;

import com.codeclan.example.EmployeeDepartmentLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
