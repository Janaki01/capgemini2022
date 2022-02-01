package com.demo.assignments;

class Animal {
	void eat() {
		System.out.println("I'm hungry");
	}
	void sleep() {
		System.out.println("I'm sleepy");
	}

}
class Bird extends Animal{
	void fly() {
		System.out.println("I'm flying");
	}
}
class Animals{
	public static void main(String args[])
{
		Bird b= new Bird();
		b.fly();
		
		Animal a=new Animal();
		a.eat();
		a.sleep();
		}
}
