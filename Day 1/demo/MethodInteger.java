package com.demo;
import java.util.*;
class OperationPrintInt {
	void printInt(int a) {
		System.out.println("The given Integer is "+a);
	}
}

public class MethodInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a= sc.nextInt();
		OperationPrintInt c = new OperationPrintInt();
		c.printInt(a);
	}

}