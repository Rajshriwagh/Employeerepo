package com.emp.employeewage;

import java.util.Random;

public class EmployeeWage {
	int present = 1;
	Random random = new Random();
	int attend = random.nextInt(2);

	public void employeeAttendance() {
		if (present == attend) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
}
