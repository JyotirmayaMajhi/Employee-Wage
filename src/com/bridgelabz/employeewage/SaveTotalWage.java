package com.bridgelabz.employeewage;

import java.util.Scanner;
public class SaveTotalWage {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private String company = "";
	private int empRatePerHr = 0;
	private int numofWorkingDays = 0;
	private int maxHrsPerMonth = 0;
	private int totalWage = 0;
	
	public SaveTotalWage(String company, int empRatePerHr,
							int numofWorkingDays, int maxHrsPerMonth, int totalWage) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numofWorkingDays = numofWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
		this.totalWage = totalWage;
		
	}
	
	public void computeEmpWage() {
		int empHrs=0,totalempHrs=0,totalWorkingdays=0;
		while(totalempHrs <= maxHrsPerMonth && totalWorkingdays < numofWorkingDays )
		{
			totalWorkingdays++;
			int empSwitchCheck= (int)Math.floor(Math.random()*10)%3;
			switch(empSwitchCheck) 
			{
			case 1:
				empHrs=4;
				break;
			case 2:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			totalempHrs += empHrs;
			System.out.println("Days= " +totalWorkingdays+ "Employee Hours:" +empHrs);

		}
		int totalEmpWage = totalempHrs+empRatePerHr;
	}
	@Override
	public String toString() {
		return "Total Emp Wage of Comapny" +company+"totalEmpWage";
		
	}
	public static void main(String[] args) {
		
		SaveTotalWage jio = new SaveTotalWage("Jio", 20, 2, 10, 10 );
		SaveTotalWage airtel = new SaveTotalWage("Airtel", 20, 10, 300, 20);
	}

}
