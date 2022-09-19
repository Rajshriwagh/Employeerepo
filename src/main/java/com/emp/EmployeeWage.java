package com.emp.employeewage;

import java.util.Random;

public class EmployeeWage {
	public static final int empRatePerHr = 20;
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	public static void main(String[] args) {
		// Constant

		// Variables
		//int empCheck = 0;
		int empHrs = 0;
		int empWage = 0;

		// computation
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case isPartTime:
			empHrs = 4;
		case isFullTime:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * empRatePerHr;
		System.out.println("Employee Daily wage is " + empWage);
	}
}
