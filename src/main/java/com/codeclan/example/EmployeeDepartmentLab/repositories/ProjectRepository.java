package com.codeclan.example.EmployeeDepartmentLab.repositories;

import com.codeclan.example.EmployeeDepartmentLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
