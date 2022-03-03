package com.demo.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.pojo.Address;
import com.demo.pojo.Employee;

public class Service {
	
	private static SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;
	
	public void show() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transaction
		transaction = session.beginTransaction();
		
		Employee e1=new Employee();    
	    e1.setName("Ravi Malik");    
	    e1.setEmail("ravi@gmail.com");    
	      
	    Employee e2=new Employee();  
	    e2.setName("Anuj Verma");  
	    e2.setEmail("anuj@gmail.com");  
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("G-13,Sector 3");    
	    address1.setCity("Noida");    
	    address1.setState("UP");    
	    address1.setCountry("India");    
	    address1.setPincode(201301);    
	        
	    e1.setAddress(address1);    
	    e2.setAddress(address1); 
	    
	    session.save(e1);
	    session.save(e2);
	    
	    transaction.commit();
		
	}

}