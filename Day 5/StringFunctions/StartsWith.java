package StringFunctions;

public class StartsWith {
	public static void main(String[] ar) {
		
	        String str = "This is my home";    
	          
	        System.out.println(str.startsWith("J"));    
	  
	         
	        System.out.println(str.startsWith("T")); 
	        // offset is 1  
	        System.out.println(str.startsWith("h",1));
	} 

}
