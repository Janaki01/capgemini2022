package com.demo.assignments;
import java.util.Scanner;

public class ZeeZeeBank {

	public static void main(String args[]) {
		 String accountnumber="9876543210";
		 int initialbalance=15000;
		 int depositedamount,with_amnt;
		 
		 System.out.println("Enter the deposited amount");
		 Scanner s= new Scanner(System.in);
		 depositedamount=s.nextInt();
		 
		 
		 System.out.println("Enter the withdrawing amount");
		 with_amnt=s.nextInt();
		 
		 int availablebalance;
		 availablebalance=initialbalance+depositedamount;
		 
		 if(with_amnt>availablebalance) {
			 System.out.println("Insufficient balance");
		 }
		 else {
			 availablebalance-=with_amnt;
		 }
		 
		 
		 System.out.println("The available balance is:"+availablebalance);
		 
		 
		 
			}

}