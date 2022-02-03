package StringFunctions;

public class Format {
	public static void main(String args[]){  
		String name="Janaki";  
		String s1=String.format("name is %s",name);  
		String s2=String.format("value is %f",32.33434);  
		String s3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		}  

}
