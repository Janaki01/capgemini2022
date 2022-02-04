package com.demo.Day6;

import java.util.Random;


public class Colors implements Runnable {

	public static void main(String[] args) {
		Colors colors = new Colors();
		Thread t1 = new Thread(colors);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}