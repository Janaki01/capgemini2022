//Terminal Operation
package com.demo.Day11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Count {
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
		long totalMatched = memberNames.stream().filter((s) -> s.contains("J")).count();
		 
		System.out.println(totalMatched);
}
}