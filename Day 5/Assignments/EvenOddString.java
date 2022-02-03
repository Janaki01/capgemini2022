package com.demo.Assignments;
import java.util.Scanner;
public class EvenOddString {
	public static void main(String[] ar) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int n=s1.length();
		if(s1.length()%2==0) {
			System.out.println(s1.substring(0, n/2));
			
		}
		else {
			System.out.println("NULL");
		}
	}

}
