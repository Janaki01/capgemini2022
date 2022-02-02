package com.demo.Day4;

import java.util.Scanner;
public class Color {

	public static void main(String[] args) {
		System.out.println("Enter any Letter:");
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char letter = s.next().charAt(0);
		if(letter == 'R') {
			System.out.println("Red");
		}
		else if(letter=='B') {
			System.out.println("Blue");
		}
		else if(letter=='G') {
			System.out.println("Green");
		}
		else if(letter=='O') {
			System.out.println("Orange");
		}
		else if(letter=='Y') {
			System.out.println("Yellow");
		}
		else if(letter=='W') {
			System.out.println("White");
		}
		else {
			System.out.println("Invalid code");
		}
	}

}