package com.demo.Day3;


import java.util.Scanner;

class Fruits{
	String name;
	String taste;
	String size;
	
	void eat() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fruit name:");
		name = s.nextLine();
		System.out.println("Enter fruit taste:");
		taste = s.nextLine();
		System.out.println("Enter fruit size:");
		size = s.nextLine();
		
		System.out.println("The Fruit name is: " + name);
		System.out.println("It tastes like: " + taste);
		
		s.close();
		
	}
}


class Apple extends Fruits{
	void eat() {
		System.out.println("This is Apple!!");
		System.out.println("I am sweet");
	}
}

class Orange extends Fruits{
	void eat() {
		System.out.println("This is Orange!!");
		System.out.println("I am sour");
	}
}public class Fruit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits f = new Fruits();
		f.eat();

	}

}