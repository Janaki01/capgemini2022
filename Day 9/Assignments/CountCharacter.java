package com.demo.Day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountCharacter {
	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the file name");
	String filename = sc.nextLine();
		 
	System.out.println("Enter the character to be counted");
	char characters = sc.nextLine().charAt(0);

	File file = new File(filename);
	int charCount = 0;
	
	BufferedReader br = new BufferedReader(new FileReader(file));
	
	int ch;
	do {
		ch = br.read();
		
		if (ch >= 65 && ch <= 90) ch += 32;
		if (characters >= 65 && characters <= 90) characters += 32;
		
		if (ch == characters)
			charCount++;
	} while (ch != -1);
			
	System.out.println("File '" + filename + "' has " +
			charCount + " instances of letter '" + characters + "'.");
	
	br.close();
	sc.close();
}

}