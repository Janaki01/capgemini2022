package com.demo;
import java.util.*;
class OperationAscii {
	void checkChar(char a) {
		int n = (int)a;
	      System.out.println("The ASCII value of given character is "+n);
	}
}
public class MethodASCII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Character:");
      char a = sc.next().charAt(0);
      OperationAscii c = new OperationAscii();
		c.checkChar(a);
	}

} 