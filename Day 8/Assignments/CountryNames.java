package com.demo.Day7;

public class CountryNames {

		public static void main(String[] args) {
			Country countries = new Country();
			countries.saveCountryNames("India");
			countries.saveCountryNames("USA");
			countries.saveCountryNames("Pakistan");
			countries.saveCountryNames("Bangladesh");
			countries.saveCountryNames("China");

			System.out.println("India: " + countries.getCountry("India"));
			System.out.println("Japan: " + countries.getCountry("Japan"));		
		}

	
}
