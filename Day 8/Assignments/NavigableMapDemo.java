package com.demo.Day8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapDemo {
public static void main(String ar[]) {
		
	 NavigableMap<Integer, String> map = new TreeMap<Integer, String>(); // legacy way
		
		map.put(1, "Janaki");
		map.put(2, "Akanksha");
		map.put(3, "Charvi");
		map.put(4, "Saranya");
		
		Set set = map.entrySet();
	
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(" Key--->" + entry.getKey() + "value -->"+entry.getValue());
		}
	
	
	}
	


}
