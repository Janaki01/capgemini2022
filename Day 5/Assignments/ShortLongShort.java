package com.demo.Assignments;
import java.util.Scanner;
public class ShortLongShort {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()<s2.length()) {
			String A=s1.concat(s2);
			
			System.out.println(A.concat(s1));
		}
		else {
			String B=s2.concat(s1);
			
			System.out.println(B.concat(s2));
		}
	}

}
