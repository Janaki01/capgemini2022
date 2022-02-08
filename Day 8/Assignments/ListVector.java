package com.demo.Day7;



	import java.util.Iterator;
	import java.util.Vector;

	class Employee1 {
		private int id;
		private String name;
		private String address;
		private Double salary;
		
		public Employee1(int id, String name, String address, Double salary) {
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

	public class ListVector {

		public static void main(String[] args) {
			Vector<Employee1> list = new Vector<>();
			
			list.add(new Employee1(101, "Bob", "123 street, India", 20000.0));
			list.add(new Employee1(102, "Alice", "234 street, India", 30000.0));
			list.add(new Employee1(103, "John", "345 street, India", 25000.0));
			list.add(new Employee1(104, "Stuart", "456 street, India", 40000.0));
			
			Iterator<Employee1> it = list.iterator();
			while (it.hasNext()) 
				System.out.println(it.next());
			

		}

	}
