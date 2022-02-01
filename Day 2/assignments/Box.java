package com.demo.assignments;

public class Box {

	    public void initialize(double h,double w,double d)
	    {
	        double height=h, depth=d,width=w;
	    }
	    public double volume(double h,double w,double d)
	    {
	        return h*w*d;
	    }
	    public static void main(String[] args) {
	        Box b=new Box();
	        b.initialize(1,2,5);
	        System.out.println("volume:"+b.volume(1,2,5));
	    }


}