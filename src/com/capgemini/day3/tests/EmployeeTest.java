package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.Employee;
class EmployeeTest {
	
	Employee employee;
	Employee employee1;
	
	@BeforeEach
	void setUp() {
		employee = new Employee(124, "krishna", 50000, 2500);
		employee1=new Employee(1234,"chaitanya",1300,2500);
	}
	
	@Test
	void testCalculateNetSalary() {
		assertEquals(20240.0, employee.calculateNetSalary(), 0.02);
		
	}
	
	@AfterEach
	void tearDown() {
		employee = null;
	}
}
