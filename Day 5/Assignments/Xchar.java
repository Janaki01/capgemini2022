package com.demo.Assignments;

import java.util.Scanner;

public class Xchar {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		if(str.charAt(0)=='x'||str.charAt(n-1)=='x') {
			System.out.println(str.substring(1, n-1));
		}
		else {
			System.out.println(str.substring(0, n));
		}
	}
}