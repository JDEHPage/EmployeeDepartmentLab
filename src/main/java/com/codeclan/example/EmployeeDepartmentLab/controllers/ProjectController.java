package com.codeclan.example.EmployeeDepartmentLab.controllers;

import com.codeclan.example.EmployeeDepartmentLab.models.Employee;
import com.codeclan.example.EmployeeDepartmentLab.models.Project;
import com.codeclan.example.EmployeeDepartmentLab.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeDepartmentLab.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
