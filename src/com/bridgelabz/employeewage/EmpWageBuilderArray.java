package com.bridgelabz.employeewage;

public class EmpWageBuilderArray {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numofcompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int empRatePerHr,
			int numofWorkingDays, int maxHrsPerMonth) {
		companyEmpWageArray[numofcompany] = new CompanyEmpWage(company, empRatePerHr, 
									numofWorkingDays, maxHrsPerMonth);
		numofcompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0; i<numofcompany;i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		}
	}
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs=0,totalempHrs=0,totalWorkingdays=0;
		while(totalempHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingdays < companyEmpWage.numofWorkingDays )
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
		int totalEmpHr= companyEmpWage.empRatePerHr;
		return totalEmpHr;
	}
	
	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Jio",20 , 2, 10);
		empWageBuilder.addCompanyEmpWage("Airtel", 10, 4, 20);
	}
}
