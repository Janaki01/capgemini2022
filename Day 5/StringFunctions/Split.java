package StringFunctions;

public class Split {
	 public static void main(String args[])
	    {
	        String str = "Janaki@Janaki%Janaki";
	        String[] arrOfStr = str.split("@", 0);
	 
	        for (String a : arrOfStr)
	            System.out.println(a);
	    }

}
