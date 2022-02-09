package com.demo.Day9;
 

/**
 * The important points about ArrayDeque class are:
Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.
 * 
 * 
 */

import java.util.*;

public class DequeueDemo {
	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Rani");
		deque.add("sita");
		deque.add("Gita");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
	}
}


 
