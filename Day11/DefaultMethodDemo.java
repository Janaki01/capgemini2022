package com.demo.Day11;


	interface  NumberType {  //2022           
		
		public boolean checkNumberType(int number);

		default void CheckStringType(int number) {
			
		}

		default int CheckPrimeType(int number) {
			
			//add logic here
			return number;
			
		}

		}

		///2030
		class NumberTypeUtility implements NumberType{
			

		@Override
		public boolean checkNumberType(int number) {
			///logic
			return false;
		}
			
			
		}

		public class DefaultMethodDemo {

			public static void main(String[] args) {
				
				NumberTypeUtility d = new NumberTypeUtility();
				
				d.checkNumberType(45);
				d.CheckStringType(48);
			}

		
}
