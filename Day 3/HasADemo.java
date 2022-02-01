package com.demo.Day3;
/// this is an another component
class Engine {
	void start() {
		System.out.println("Engine Start");
	}
void stop() {
	System.out.println("Engine Stop");
	}
}
class Bike {
	void speed() {
		System.out.println("Bike has speed");
	}
	void color() {
		System.out.println("Bike has color");
	}
}
///     IS-A relation ship
class Yamaha extends Bike {
	void speed() {
		System.out.println("Bike has speed  300 mile/hr");
	}
	void color() {
		System.out.println("Yamaha has red in  color");
	}
	/////user defined
	void showBikeComponentDetails() {
		///pluge in the engine component here
		Engine Yamahaengine = new Engine();//// created the object of Engine class and referenced here
		
		Yamahaengine.start();
		Yamahaengine.stop();
		}
	}

public class HasADemo {
	public static void main(String ar[]) {
		Yamaha Yamahabike = new Yamaha();
		Yamahabike.showBikeComponentDetails();
	}
	}