package com.demo.Assignments;

import java.util.Scanner;

public class wordseparator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s2.join(s1,s2,s2));
		}
	}


