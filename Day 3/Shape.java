package com.demo.Day3;

class Shapes{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}

class Circle1 extends Shapes{
	void draw() {
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("Erasing circle");
	}
}

class Triangle extends Shapes{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing triangle");
	}
}

class Square extends Shapes{
	void draw() {
		System.out.println("Drawing square");
	}
	void erase() {
		System.out.println("Erasing square");
	}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes c=new Circle1();
		Shapes t=new Triangle();
		Shapes s=new Square();
		
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	} 
 
}