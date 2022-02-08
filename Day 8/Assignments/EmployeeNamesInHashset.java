package com.demo.Day7;


	import java.util.HashSet;
	import java.util.Iterator;
	public class EmployeeNamesInHashset {
		public static void main(String[] args) {
			HashSet<String> set = new HashSet<>();
			
			set.add("Janaki");
			set.add("Akanksha");
			set.add("Charvi");
			set.add("Saranya");
			
			Iterator<String> it = set.iterator();
			while (it.hasNext())
				System.out.println(it.next());

		}

	
}
