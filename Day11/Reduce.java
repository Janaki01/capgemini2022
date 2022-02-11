//Terminal Operation

package com.demo.Day11;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Reduce {
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
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
	}
}
