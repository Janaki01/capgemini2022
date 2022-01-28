package com.demo;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {

        double n1 = 1000, n2 = 2545, n3 = 2593;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");

}
}