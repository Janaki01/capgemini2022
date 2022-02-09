package com.demo.Day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapDemo {
public static void main(String ar[]) {
		
	 NavigableMap<Integer, String> map = new TreeMap<Integer, String>(); // legacy way
		
		map.put(1, "Rani");
		map.put(2, "Sita");
		map.put(3, "Akanksha");
		map.put(4, "janaki");
		
		Set set = map.entrySet();
	
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(" Key--->" + entry.getKey() + "value -->"+entry.getValue());
		}
	
	
	}

}
 

 
