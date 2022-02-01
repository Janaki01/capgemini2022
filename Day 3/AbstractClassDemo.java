package com.demo.Day3;

abstract class ABC {
	// contructor
	ABC() {
		
	}
	// non abstract method
	void show() {
		System.out.println(" this show   abc class");
		}
	// non abstract method
	abstract void show1();
	//static methods
	static void show3() {
		
	}
	}
// this is my concreate class
class xyz extends ABC{
  //overrid is happening here

	void show1() {
		System.out.println(" this show1  is the version of  xyz class not abc class");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {

		ABC a = new xyz();
		a.show1();
	}

}
