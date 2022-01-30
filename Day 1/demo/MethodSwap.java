package com.demo;
import java.util.*;
class OperationSwapNums {
	void swapNums(int a,int b) {
		int temp;
		   temp=a;
		   a=b;
		   b=temp;
		   System.out.println("After swapping the numbers are:");
		   System.out.println(a);
		   System.out.println(b);
	}
}

public class MethodSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the numbers to swap one by one :");
   int a = sc.nextInt();
   int b = sc.nextInt();
   OperationSwapNums c = new OperationSwapNums();
   c.swapNums(a,b);
	}

}