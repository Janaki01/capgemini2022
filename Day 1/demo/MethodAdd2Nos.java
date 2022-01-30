package com.demo;
import java.util.*;
class Operation {
	void add(int a,int b) {
		System.out.println("The sum of given two number is "+(a+b));
	}
}
public class MethodAdd2Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to add:");
		int a= sc.nextInt();
		int b = sc.nextInt();
		Operation c = new Operation();
		c.add(a,b);

	}

}