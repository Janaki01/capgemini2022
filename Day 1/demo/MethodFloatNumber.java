package com.demo;
import java.util.*;
class OperationMulFloatNums {
	void mulFloatNums(float a,float b) {
		 System.out.println("Product of given float numbers = "+(a*b));
 }
}

public  class MethodFloatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two float point numbers");
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      OperationMulFloatNums c = new OperationMulFloatNums();
      c.mulFloatNums(a,b);
	}

}