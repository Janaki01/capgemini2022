package com.demo.Day10;
@FunctionalInterface
interface Drawables{
	
	public void  draw();
	
}


public class LambdaExpressionDemo {
		
	public static void main(String ar[]) {
		
		int width = 10;
		//functional style
		Drawables d =() ->{
			
			System.out.println("draw"+width);
		};
		d.draw();
	}

}