package com.demo.assignments;

import java.util.*;
class Compartment {
	double heights;
	double widths;
	double breadths;
	public Compartment(double height, double width,double breadth) {
		heights = height;
		widths = width;
		breadths = breadth;
	}
	
}
public class Compartmentship {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Compartment compartment = new Compartment(5.6,44.5,20.9);
		
		System.out.println(compartment.heights);
		System.out.println(compartment.widths);
		System.out.println(compartment.breadths);


	}

}