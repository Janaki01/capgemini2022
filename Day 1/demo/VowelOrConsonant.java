package com.demo;

public class VowelOrConsonant {
	
	public static void VowelOrConsonant (char x)
		    {
		        if (x == 'a' || x == 'e' || x == 'i' || x == 'o'
		            || x == 'u')
		            System.out.println("It is a Vowel.");
		        else
		            System.out.println("It is a Consonant.");
		    }
		  
		    static public void main(String[] args)
		    {
		        VowelOrConsonant('b');
		       
	
}
}