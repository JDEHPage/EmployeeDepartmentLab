package com.codeclan.example.EmployeeDepartmentLab;

import com.codeclan.example.EmployeeDepartmentLab.models.Department;
import com.codeclan.example.EmployeeDepartmentLab.repositories.DepartmentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDepartmentLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createDepartment() {
		Department department = new Department("General General Affairs");
		departmentRepository.save(department);
	}
}
