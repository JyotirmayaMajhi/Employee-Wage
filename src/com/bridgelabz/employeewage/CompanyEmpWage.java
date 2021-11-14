package com.bridgelabz.employeewage;

import java.util.Scanner;
public class CompanyEmpWage {
	
	public final String company;
	public final int empRatePerHr;
	
	public int getEmpRatePerHr() {
		return empRatePerHr;
		}
	
	public int getNumOfWorkingDays() {
		return numofWorkingDays;
		}
	
	public int getMaxHrsPerMonth() {
		return maxHrsPerMonth;
		}
	
	public final int numofWorkingDays;
	public final int maxHrsPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHr,
							int numofWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numofWorkingDays = numofWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage foe company" +company+ "is:"+totalEmpWage;
		
	}

}
