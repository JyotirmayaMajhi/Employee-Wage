package com.bridgelabz.employeewage;

public class Employeewageuc8 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	public static int computEmpWage(String Company, int MAX_HR_IN_MONTH, int NUM_OF_WORKING_DAYS,
										int IS_RATE_PER_HR) {
		int empHrs=0,totalempHrs=0,totalWorkingdays=0;
		while(totalempHrs <= MAX_HR_IN_MONTH && totalWorkingdays < NUM_OF_WORKING_DAYS )
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
		int totalEmpWage = totalempHrs+IS_RATE_PER_HR;
		System.out.println("Total Employee Wage=" +totalEmpWage);
		return totalEmpWage;
	}
	
	public static void main(String[] args) {
		computEmpWage("Vodafone", 20, 2, 10);
		computEmpWage("CocaCola", 20, 4, 10);
	}
}
