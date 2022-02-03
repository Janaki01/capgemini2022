package StringFunctions;
import java.util.Scanner;
public class GetChar {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String s = sc.nextLine();
	char[] c = new char[50]; 
			s.getChars(0, 5, c, 0);
			System.out.println(c);
	}
}
