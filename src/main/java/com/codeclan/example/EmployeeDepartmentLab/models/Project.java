package com.codeclan.example.EmployeeDepartmentLab.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private int duration;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name="employee_projects",
            joinColumns = { @JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "project_id",
                            nullable = false,
                            updatable = false)
            }
    )
    private List<Employee>employees;

    public Project(String name, int duration, Employee employee) {
        this.name = name;
        this.duration = duration;
        this.employees = new ArrayList<Employee>();
    }

    public Project(){

    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
