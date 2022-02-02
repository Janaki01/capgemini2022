package com.demo.Day4;
/*
 * 
 * However, an interface is different from a class in several ways, including −

You cannot instantiate an interface.

An interface does not contain any constructors.

All of the methods in an interface are abstract.

An interface cannot contain instance fields. 
The only fields that can appear in an interface must be declared both static and final.

An interface is not extended by a class; it is implemented by a class.

An interface can extend multiple interfaces.
 * 
 * 
 * 
 * */

interface Admin {

	public abstract void read();

	public abstract String write(int flag);

	double execute(double flag1, double flag2);

}

interface Admin2 {

	public abstract void read();

}

class KishoreSubAdim implements Admin2 {

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

}

class RohitSubAdmin implements Admin {

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public String write(int flag) {

		if (flag == 1) {

			System.out.println(" this is rohit");

		} else {

			System.out.println(" this is not rohit");
		}

		return null;
	}

	@Override
	public double execute(double flag1, double flag2) {
		// TODO Auto-generated method stub
		return 0;
	}

}


public class InterfaceDemoAdmin {

	public static void main(String ar[]) {

		RohitSubAdmin subadmin = new RohitSubAdmin();

		subadmin.write(2 );

	}

}