package com.demo.Day8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CountryTreeSet {
	

		public static void main(String[] args) {
			Set<String> CountryTreeSet = new TreeSet<String>();
			
			Country countries = new Country();
			CountryTreeSet.add("India");
			CountryTreeSet.add("USA");
			CountryTreeSet.add("Pakistan");
			CountryTreeSet.add("Bangladesh");
			CountryTreeSet.add("China");

			System.out.println("India: " + countries.getCountry("India"));
			System.out.println("Japan: " + countries.getCountry("Japan"));		
		}

	

}
