//Terminal Operation

package com.demo.Day11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Collect { 
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
		
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

          System.out.print(memNamesInUppercase);
	}
}


 
