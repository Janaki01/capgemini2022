package com.demo.Day11;

import java.util.Optional;
import java.util.OptionalInt;

class OptionalClass {
	
public Integer Sum(Optional<Integer> a,Optional <Integer> b) {
	
	System.out.println(a.isPresent());
	System.out.println(b.isPresent());
	
	Integer a1=a.orElse(0);
	Integer b1=b.get();
	
	return a1+b1;
}
}
public class OptionalDemo{
	public static void main(String[] ar) {
		OptionalClass d = new OptionalClass();
		Integer value1=null;
		Integer value2=new Integer(10);
		Optional<Integer> a =Optional.ofNullable(value1);
		Optional<Integer> b =Optional.of(value2);
		System.out.println(d.Sum(a, b));
		
	}
}
