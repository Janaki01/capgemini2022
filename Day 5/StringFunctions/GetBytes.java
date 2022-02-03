package StringFunctions;

public class GetBytes {
		public static void main(String args[]){  
		String s1="ABCDEFG";  
		byte[] b=s1.getBytes();  
		for(int i=0;i<b.length;i++){  
		System.out.println(b[i]);  
		}  
		}
}
