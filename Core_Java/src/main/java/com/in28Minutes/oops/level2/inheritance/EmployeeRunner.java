package com.in28Minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("Sagar", "Technology Lead");

//		employee.setName(,"Sagar");
		employee.setEmail("Sagar@gmail.com");
		employee.setPhoneNumber(123456789);
		employee.setEmployer("Dell");
//		employee.setTitle("Technology Lead");
		employee.setEmployeeGrade('C');
		employee.setSalary(new BigDecimal("4500.68")); // always use String value in BigDecimal

		System.out.println(employee);
	}

}
