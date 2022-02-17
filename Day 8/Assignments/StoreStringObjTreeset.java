package com.demo.Day8;
import java.util.Collections;
import java.util.Iterator;

import java.util.TreeSet;

public class StoreStringObjTreeset {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Janaki");
		set.add("Akanksha");
		set.add("Saranya");
		set.add("Charvi");
		
		String query = "Saranya";
		boolean result = false;
		  
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}



}
