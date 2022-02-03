package StringFunctions;

public class Intern {
	public static void main(String[] ar) {
		String s1="Welcome";
		String s2=new String("Welcomeback");
		String s3=s1.intern();
		System.out.println(s2);
	}

}
