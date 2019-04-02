package com.codeclan.example.EmployeeDepartmentLab;

import com.codeclan.example.EmployeeDepartmentLab.models.Department;
import com.codeclan.example.EmployeeDepartmentLab.models.Employee;
import com.codeclan.example.EmployeeDepartmentLab.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeDepartmentLab.repositories.EmployeeRepository;
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

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createDepartmentAndEmployee() {
		Department department = new Department("General General Affairs");
		departmentRepository.save(department);
		Employee employee = new Employee("Steve", "Squid","W34ER", department);
		employeeRepository.save(employee);
	}


}
