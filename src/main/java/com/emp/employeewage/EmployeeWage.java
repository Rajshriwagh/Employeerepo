package com.emp.employeewage;

import java.util.Random;

public class EmployeeWage {

	int empRatePerHr = 20;
	int empHr;
	int empWage;

	int present = 1;
	Random random = new Random();
	int attend = random.nextInt(2);

	public void employeeAttendance() {
		if (present == attend) {
			empHr = 8;

		} else {
			empHr = 0;
		}
		empWage = empHr * empRatePerHr;
		System.out.println("Employee Daily wage is " + empWage);
	}
}
