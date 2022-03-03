package Day1;

public class Occurences {
	public static void main(String[] args) {
		String s="Hello!! I am from Hyderabad";
		int count =0;
	    Character searchChar = 'd';
	    for (int i=0;i<s.length();i++) {
	    	if(s.charAt(i)== searchChar) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    	
	}

}
