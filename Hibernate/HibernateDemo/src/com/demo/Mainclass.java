package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class CrudOperation {

	private static SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Integer employeeid = null;

	// business logic part for insert or add
	public Integer addEmployee(String firstname, String lastname, String salary) {
		// initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transaction

		transaction = session.beginTransaction();
		Employee employee = new Employee(firstname, lastname, salary);
		employeeid = (Integer) session.save(employee);// this save() will form "insert into table " query automatically in db"
		transaction.commit();
		return employeeid;

	}
	
	//API logic to read employee table
	public void readEmployee() {   
		
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
        Query query = session.createQuery("FROM Employee");
        List<Employee> employeelist = query.list();
		for (Employee newlist : employeelist) {
			System.out.println("first name is" + newlist.getFirstname());
			System.out.println("last name is" + newlist.getLastname());
			System.out.println("sal" + newlist.getLastname());

		}

	}
	
	// API logic to  update employee table by Id
	public Employee updateEmployeeById(Employee empobject, int id) { 
		
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		Employee employee = (Employee)session.get(Employee.class, id);
	
		employee.setFirstname(empobject.getFirstname());  // values are coming from client that isMainClas
		employee.setLastname(empobject.getLastname());
		employee.setSalary(empobject.getSalary());
		session.update(employee);
		transaction.commit();
		return employee;

	
	}
	public List<Employee> getEmplist(){
		   
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	    Query query = session.createQuery("FROM Employee");
		List<Employee> employeelist = query.list();
	   return employeelist;
	  
   }
	
//API logic to delete Employee by Id
	public Employee findById(int empid) {
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		// begin transaction
		transaction=session.beginTransaction();
		Employee findbyid = (Employee)session.load(Employee.class, empid);
		return findbyid;  //return the id  from the db
	}
	
	//we need common session

	void deleteEmployeeRecordById(int empid) {
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		transaction=session.beginTransaction();
	    Employee deleteobj = findById(empid); //fetching existing id from the database with the help of findByIdMethod()
		session.delete(deleteobj);
		transaction.commit();
		   
	}	
	
//API logic to delete all employee details
	public String deleteAllEmployeeRecord() {
		
			sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery("DELETE FROM Employee");
			Integer result = query.executeUpdate();
			transaction.commit();

			if (result > 0) {
				return "Sucessfully deleted all records";
			} else {
				return "No record found";
			}
		}
	
}

public class Mainclass {

	public static void main(String[] args) {

		CrudOperation crudOperation = new CrudOperation();
		
// TO ADD EMPLOYEE TABLE
		
		Integer result = crudOperation.addEmployee("ram", "kumar", "45000");
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
	 	
	 //	String result =	crudOperation.deleteAllEmployeeRecord();
	 // System.out.println(result);
		
	 //	System.out.println("Done....");

	}
	