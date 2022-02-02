package com.demo.Day4;
import java.util.Scanner;
public class AlphabeticalOrder {

		    public static void main (String[] args)
		    {
		    	System.out.println("Enter alphabets:");
		    	 Scanner sc=new Scanner(System.in);
		         char item1=sc.next().charAt(0);
		         char item2=sc.next().charAt(0);
		        if (item1>item2)
		            System.out.println(item2+" , "+item1);
		       
		        else
		            System.out.println(item1+" , "+item2);
		       
		         
		    }
		    }