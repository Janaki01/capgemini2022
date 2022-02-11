package com.demo.Day11;

import java.util.stream.Stream;
public class Generate {
	public static void  main(String ar[]) {
		Stream<String> streamGenerated =Stream.generate(() -> "Hello").limit(10);
		streamGenerated.limit(20).forEach(System.out::println);
		
		 
	    }
	
	
}