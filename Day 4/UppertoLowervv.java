package com.demo.Day4;
import java.util.Scanner;
 
public class UppertoLowervv {

	public static void main(String[] args) {
		System.out.println("Enter a character:");
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char a=s.next().charAt(0);
        char b;
        if(Character.isLowerCase(a))
            b= Character.toUpperCase(a);
        else
            b= Character.toLowerCase(a);
        System.out.println(a+"->"+b);

	}

}