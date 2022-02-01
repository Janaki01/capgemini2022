package com.demo.Day3;

import java.util.Scanner;
interface Maintain 
{
	float charge = 0;
	void Calculate(float n) ;
}
class Savings extends BankAccount implements Maintain
{
		Scanner z=new Scanner(System.in);
	float n = z.nextFloat();
	int m=50;
	void Calculate()
	{
		float charge = (m*n)+50;
		System.out.println("charge for savings is :"+charge);
	}
	@Override
	public void Calculate(float n) {
		// TODO Auto-generated method stub
		
	}
}
class Current extends BankAccount implements Maintain
{
	Scanner w=new Scanner(System.in);
	float n = w.nextFloat();
	int m=100;
	void Calculate()
	{
		float charge = (m*n)+200;
		System.out.println("charge for savings is :"+charge);
	}
	@Override
	public void Calculate(float n) {
		// TODO Auto-generated method stub
		
	}
}

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice:");		
	 Scanner d = new Scanner(System.in);
	 int x = d.nextInt();
	 System.out.println("Enter your Account number:");
	 double a = d.nextInt();
	 System.out.println("Enter your name:");	
	String name = d.next();
	System.out.println("Enter your balance:");	
	float b = d.nextFloat();
	if(x==1)
	{
		Savings q =new Savings(); 
		q.Calculate();
	}
else if (x==2)
{
	Current p =new Current(); 
	p.Calculate();
}
  }  
}