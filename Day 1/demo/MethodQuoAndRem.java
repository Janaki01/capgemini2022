 package com.demo;
import java.util.*;
class OperationFindQuoRem {
	void findQuoRem(int a,int b) {
		System.out.println("the Quotient = "+(a/b));
	      System.out.println("the Remainder = "+(a%b));
	}
}
public class  MethodQuoAndRem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter dividend :");
      int a= sc.nextInt();
      System.out.println("Enter divisor :");
      int b= sc.nextInt();
      OperationFindQuoRem c = new OperationFindQuoRem();
      c.findQuoRem(a,b);
	}

} 