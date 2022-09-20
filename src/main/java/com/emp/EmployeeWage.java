package com.emp;

import java.util.Random;

public class EmployeeWage {
	public static final int empRatePerHr = 20;
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int numOfWorkingDays =20;

	public static void main(String[] args) {
		// Variables
	     int empCheck = 0;
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		// computation
		for (int day = 0; day < numOfWorkingDays; day++) {
			int emp = (int) Math.floor(Math.random() * 10) % 3;
			switch (emp) {
			case isPartTime:
				empHrs = 4;
			case isFullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * empRatePerHr;
			totalEmpWage += empWage;
			System.out.println("Employee Daily wage is " + empWage);
		}
		System.out.println("Employee Daily wage is " + totalEmpWage);
	}
	
}
