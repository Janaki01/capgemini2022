package com.demo.Day8;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class EmployeeDetails {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public EmployeeDetails(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Employee {


	public static void main(String[] args) {
		List<EmployeeDetails> list = new ArrayList<>();
		
		list.add(new EmployeeDetails(101, "Bob", "123 street, India", 20000.0));
		list.add(new EmployeeDetails(102, "Alice", "234 street, India", 30000.0));
		list.add(new EmployeeDetails(103, "John", "345 street, India", 25000.0));
		list.add(new EmployeeDetails(104, "Stuart", "456 street, India", 40000.0));
		
		Iterator<EmployeeDetails> it = list.iterator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		Integer Id=sc.nextInt();
	
		while (it.hasNext()) {
			EmployeeDetails emp = it.next();
			if (emp.getId() == Id)
				System.out.println(emp);
			else {
		System.out.println("Doesnot exist");
		}
	}
	}
}