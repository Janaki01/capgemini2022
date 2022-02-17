package com.demo.Day8;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
	
	/*** Java ArrayList class can contain duplicate elements.
	 * Java ArrayList class maintains insertion order.
	 * Java ArrayList class is non synchronized.
	 * Java ArrayList allows random access because array works at the index basis.
	 * In ArrayList, manipulation is little bit slower than the
	 * LinkedList in Java because a lot of shifting needs to occur if any elements is removed from the array list.
	 * 
	 * 
	 */
		public static void main(String args[]){
			ArrayList<String> list= new ArrayList<String>();
			list.add("apple");
			list.add("mango");
			list.add("grapes");
			list.add("banana");
			Iterator iter=list.iterator();
			while (iter.hasNext())
			System.out.println(iter.next());
			}
	}


