package com.demo.Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamToList {
	 

	public static void  main(String ar[]) {
	
	
	List<Integer> list = new ArrayList<Integer>();
	 
	for(int i = 1; i< 10; i++){
	      list.add(i);
	}

	Stream<Integer> stream = list.stream();
	List<Integer> EvenNumbersList = stream.filter(i->i%2 ==0).collect(Collectors.toList());
	System.out.print(EvenNumbersList);
}
}