package com.demo.main;

import com.demo.businesslogic.CrudOperation;

public class MainClass {

	public static void main(String[] args) {

		CrudOperation crudOperation = new CrudOperation();
		
// TO ADD EMPLOYEE TABLE
		
		Integer result = crudOperation.addEmployee("Raju", "Kumar", "50000");
		System.out.println(" result is" + result);
		
// TO READ EMPLOYEE TABLE	 	
		
	     //crudOperation.readEmployee();
		
// TO UPDATE EMPLOYEE TABLE DETAILS
		
		 //Employee updatedetails = new Employee();
		// updatedetails.setFirstname("Raj");
	     //updatedetails.setLastname("kumar");
		// updatedetails.setSalary("5000");
		// Employee employee = crudOperation.updateEmployeeById(updatedetails,12);	 // update the employee  id 3
		// String firstname = employee.getFirstname();
		// System.out.println("updated value is "+firstname);
		
		
// TO GET LIST OF EMPLOYEE TABLE		
		//List<Employee> employeelist = crudOperation.getEmplist();
		
	//	for (Employee newlist : employeelist) {
	//		System.out.println("first name is" + newlist.getFirstname());
	//		System.out.println("last name is" + newlist.getLastname());
	///		System.out.println("sal" + newlist.getSalary());

		}
	 	
// TO DELETE ALL DETAILS
	 	
	// String result =	crudOperation.deleteAllEmployeeRecord();
	// System.out.println(result);
		
	 //	System.out.println("Done....");

	}
	
