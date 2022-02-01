package com.demo.assignments;


class Persons {
	String name;
	public void Person(String n) {
		name = n;
	}
}
class Teacher extends Persons {
	double salary;
	String subject;
	public Teacher (double sal, String sub) {
		salary = sal;
		subject = sub;
	}
	void PrintDetails() {
		System.out.println("Subject is " +subject);
		System.out.println("The Salary of the Teacher is " +salary);
	}
}
class Student extends Persons {
	String university;
	public Student (String u) {
		university  = u;
	}
	public void CollegeStudent(int i, String string) {
		// TODO Auto-generated method stub
		
	}
}
class CollegeStudent extends Student {
	public CollegeStudent(String u) {
		super(u);
		// TODO Auto-generated constructor stub
	}
	int year;
	String major;
	public void CollegeStudent(int y, String maj) {
		year = y;
		major = maj;
	}
	void PrintDetails() {
		System.out.println("The year of Study is " +year);
		System.out.println("The major of college student is " +major);
	}
	 
}
	public class HighSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons p = new Teacher(45000,"Chemistry");
		Student s= new CollegeStudent("ECE");
	}

}