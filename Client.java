package com.employee.payroll;

public class Client{
	public static void main(String[] args) {
		PayRollSystem payrollsystem= new PayRollSystem();
		FullTimeEmployee emp1=new FullTimeEmployee("vikas",1,70000.0);
		PartTimeEmployee emp2=new PartTimeEmployee("Alexander",2,40,100);
		
		payrollsystem.addEmployee(emp1);
		payrollsystem.addEmployee(emp2);
		
		System.out.println("Initial Employee Details: ");
		payrollsystem.displayEmployee();
		
		
	  System.out.println();		
	  System.out.println("Removing Employee");
	  payrollsystem.removeEmployee(2);
	  
	  
	  System.out.println();	
	  System.out.println("**************************");	
	  System.out.println("Remaining Employee Details:");
	
	  payrollsystem.displayEmployee();
		
	}
}
