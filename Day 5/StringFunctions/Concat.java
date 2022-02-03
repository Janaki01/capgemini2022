package StringFunctions;

import java.util.Scanner;

public class Concat {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1.concat(s2);
		System.out.println(s3);
	}	

}
