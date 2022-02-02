package com.demo.Day4;
import java.util.Scanner;
public class FloydsFormat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=sc.nextInt();//get input from user
		for(int i=0; i<=rows; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");//print star
				}
			System.out.println();
			}
		
		}
}