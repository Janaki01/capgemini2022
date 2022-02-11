package com.demo.Day10;
@FunctionalInterface
interface Messagable {

	void getMessage(String msg);

}

class Message {

	void Show(String msg) {

		System.out.println(" from method");
		System.out.println(" =====================" + msg);// using method here
	}

}
public class MethodReferencesDemo {
	public static void main(String[] args) {

		Message m = new Message();// creating obj

		// interface
		Messagable reference = m::Show; // reference of interface here

		// calling here

		reference.getMessage("Hi");

	}

}


 
