package com.demo.Day4;

import java.util.Scanner;

public class AddAllTheValues {
  
	public static void main(String arg[])  
	{  
	int n, sum;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a number: ");   
	n=sc.nextInt();   
	for(sum=0; n!=0; n=n/10)  
	{       
	sum = sum+n%10;  
	}   
	System.out.println("Sum of digits: "+sum);  
	}  
	}  