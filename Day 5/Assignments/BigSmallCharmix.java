package com.demo.Assignments;
import java.util.Scanner;
public class BigSmallCharmix {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < smaller.length(); i++) {
		sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		sb.append(bigger.substring(smaller.length(), bigger.length()));
		
		System.out.println(sb);
		
			
		}
	}


