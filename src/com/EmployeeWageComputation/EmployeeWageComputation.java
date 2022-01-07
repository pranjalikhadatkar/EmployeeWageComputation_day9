package com.EmployeeWageComputation;

public class EmployeeWageComputation {
	public static final  int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_WAGES_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	public static final int MAX_HOUR_IN_MONTH = 100;
	
	public void Empmaxwagesinmonth(){
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HOUR_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS ) {
			totalWorkingDays++;
			
		int empcheck = (int)Math.round(Math.random() * 10) %3;
		  switch (empcheck)
		{
		 case IS_PART_TIME:
			 		empHrs = 4;
			 		break;
		 case IS_FULL_TIME:
			 		empHrs = 8;
			 		break;
		 default:
			 	empHrs = 0;
			 	break;
		}
		  
		totalEmpHrs += empHrs;
		System.out.println("Day#: " + totalWorkingDays + "empHrs: " + empHrs);
	}
		int totalempwages = totalEmpHrs * EMP_WAGES_PER_HOUR;
		
	System.out.println("totalEmpWages :" + totalempwages);	
	}
	
	public static void main(String[] args) {
		EmployeeWageComputation obj=new EmployeeWageComputation();
		obj.Empmaxwagesinmonth();			
	}
}
