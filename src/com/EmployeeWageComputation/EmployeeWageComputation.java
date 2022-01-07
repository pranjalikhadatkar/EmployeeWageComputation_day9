package com.EmployeeWageComputation;

public class EmployeeWageComputation {
	final int IS_FULL_TIME = 1;
	final int EMP_WAGES_PER_HOUR = 20;
	
	public void Empwagesperhr(){
		int empHrs = 0;
		int empWages = 0;
		
			double empCheck = Math.floor(Math.random() * 10 ) % 2;
	         if (empCheck == IS_FULL_TIME)
	        	 empHrs = 8;
	         else
	        	 empHrs = 0;
	         empWages = empHrs * EMP_WAGES_PER_HOUR;
	         System.out.println("empWages: " + empWages);
	}
	
	public static void main(String[] args) {
		EmployeeWageComputation obj=new EmployeeWageComputation();
		obj.Empwagesperhr();			
	}
}

