package com.demo.Day11;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
public class ListStream {
	public static void  main(String ar[]) {
	List<Integer> list = new ArrayList<Integer>();

	for(int i = 1; i< 10; i++){
	      list.add(i);
	}

	Stream<Integer> stream = list.stream();
	stream.forEach(p -> System.out.println(p));
}
}