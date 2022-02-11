//Terminal Operation

package com.demo.Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Match { 
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
		
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);   
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);    
		 
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);     

}
}