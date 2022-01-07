package com.EmployeeWageComputation;

public class EmployeeWageComputation {
	public static final  int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_WAGES_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 2;
	
	public void Empwagesformonth() {
		int totalempwages = 0;
		int empHrs = 0;
		int empWages = 0;
		
		for (int day = 0; day < NO_OF_WORKING_DAYS; day++ ) {
			
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
		empWages = empHrs * EMP_WAGES_PER_HOUR;
		totalempwages += empWages;
		System.out.println("empWages :" + empWages);
	}
	System.out.println("totalEmpWages :" + totalempwages);
		
	}
	
	public static void main(String[] args) {
		EmployeeWageComputation obj=new EmployeeWageComputation();
		obj.Empwagesformonth();		
		
    }
}
