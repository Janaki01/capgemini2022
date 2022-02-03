package com.demo.Assignments;

import java.util.Scanner;

public class DeleteCharImmStar {
	 public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String s = sc.nextLine();
	for(int i=0;i<s.length();i++) {
		if(!(s.charAt(i)=='*'||(i!=0&&s.charAt(i-1)=='*')||(i!=s.length()-1&&s.charAt(i+1)=='*'))) {
		char result = s.charAt(i);
	System.out.print(result);
	}
	}
	}
}	
	
