package com.demo.logic;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;

public class Service {

	private static SessionFactory sessionFactory = null;
	Transaction transcation = null;
	Integer empployeeid = null;
	Session sessiong = null;

	public void MutipleQestionAnwer() {

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		sessiong = sessionFactory.openSession();

		// begin transcation
		transcation = sessiong.beginTransaction();

		Answer answer1 = new Answer();
		answer1.setAnswername("Java is a Programming Lang");
		
		Answer answer2 = new Answer();
		answer2.setAnswername("java is oops");
		
		Question question1 = new Question();
		question1.setQname("what is java?");
		
		ArrayList<Answer> l1=new ArrayList<Answer>();  
	    l1.add(answer1);  
	    l1.add(answer2);  
	    question1.setAnswers(l1); 
		
		
		
		Answer answer3= new Answer();
		answer3.setAnswername("Servlet is an Interface");
		
		Answer answer4= new Answer();
		answer4.setAnswername("Servlet is an API");
		

		Question question2 = new Question();
		question2.setQname("What is Servlet?");
		
		ArrayList<Answer> l2=new ArrayList<Answer>();  
	    l2.add(answer3);  
	    l2.add(answer4);  
	    question2.setAnswers(l2);  
		

		List<Answer> list1 = new ArrayList<Answer>();
		List<Question> list2=new ArrayList<Question>();
		
		sessiong.save(question1);// added or insert into db or persist
		sessiong.save(question2);
		
		
		list1.add(answer1);
		list1.add(answer2);
		list1.add(answer3);
		list1.add(answer4);
		list2.add(question1);
		list2.add(question2);
		
		//question1.setAnswers(list1);
		//question2.setAnswers(list1);
	
		
		transcation.commit();

	}
}
