package com.demo.Day11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectStreamToArray {

	public static void  main(String ar[]) {
	
		List<Integer> list = new ArrayList<Integer>();
		 
		for(int i = 1; i< 10; i++){
		      list.add(i);
		}

		Stream powerOfTen = Stream.of(1, 10, 100, 1000, 10000);
		Integer[] array = (Integer[]) powerOfTen.toArray(size -> new Integer[size]); 
		System.out.println(Arrays.toString(array));

		
	}

}