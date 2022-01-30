package com.demo;
import java.util.*;
class OperationOdEven {
	void oddEven(int a) {
		 if(a%2==0) {
	    	 System.out.println("The Given number is Even");
	     }
	     else {
	    	 System.out.println("The Given number is Odd");
	     }
	}
}
public class MethodOddOrEven { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a number :");
	     int a = sc.nextInt();
	     OperationOdEven c = new OperationOdEven();
	     c.oddEven(a);
	}

}