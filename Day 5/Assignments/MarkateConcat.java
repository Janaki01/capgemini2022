package com.demo.Assignments;
import java.util.Scanner;
public class MarkateConcat {
	public static void main(String[] ar) {
	    Scanner s = new Scanner(System.in);
		String s1 = "Mark";
		String s2 = "Kate";
		s1.substring(s1.length()-1).equalsIgnoreCase(s2.substring(0, 1)) ;
	    String S3=(s1.concat(s2.substring(1)));
		System.out.println(S3.toLowerCase());
		}
	}


