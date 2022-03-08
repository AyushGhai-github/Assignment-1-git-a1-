package com.springboot.assignmnet5;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Assignmnet5 {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Assignmnet5.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		
//		Employee employee=new Employee();
//		employee.setEmployeeName("Ayush");
//		employee.setEmployeeSalary("500000");
//		employee.setEmployeeDepartment("ETC");
//		employee.setEmployeeDesignation("Senior Analyst");
	
//		Employee emp1=employeeRepository.save(employee);
//		System.out.println(emp1);
		
		Optional<Employee> findById = employeeRepository.findById(1);
		System.out.println(findById);
	}

}
