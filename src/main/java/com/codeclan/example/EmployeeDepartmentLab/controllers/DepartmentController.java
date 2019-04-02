package com.codeclan.example.EmployeeDepartmentLab.controllers;

import com.codeclan.example.EmployeeDepartmentLab.models.Department;
import com.codeclan.example.EmployeeDepartmentLab.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/")
    public List<Department> getAllDepartements(){
        return departmentRepository.findAll();
    }
}
