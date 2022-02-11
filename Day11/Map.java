//Intermediate Operations
package com.demo.Day11;

import java.util.ArrayList;
import java.util.List;

public class Map {
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Akanksha");
		memberNames.add("Jahnavi");
		memberNames.add("Anushka");
		memberNames.add("Rohini");
		memberNames.add("Hasini");
		memberNames.add("Shreya");
		memberNames.add("Priya");
		memberNames.add("Janaki");
	
	memberNames.stream().filter((s) -> s.startsWith("J")).map(String::toUpperCase).forEach(System.out::println);
}
}