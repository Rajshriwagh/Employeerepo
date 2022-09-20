package com.emp;

import java.util.Random;

public class EmployeeWage {
	public static final int empRatePerHr = 20;
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int numOfWorkingDays = 20;
	public static final int maxHrsInMonth = 100;

	public static void main(String[] args) {
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		// int empWage = 0;
		// int totalEmpWage = 0;
		int totalWorkingDays = 0;
		// int empRatePerHr=0;

		// computation
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
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

			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println("Total Empwage: " + totalEmpWage);
	}

}
