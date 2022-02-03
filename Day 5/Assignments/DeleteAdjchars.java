package com.demo.Assignments;
import java.util.Scanner;
public class DeleteAdjchars {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String w = sc.nextLine();
			String str = "";
			  int end = 0;
			  int l =s.length();
			 for(int i=0;i<l;i++) 
			 {
			    end = i + w.length();
			    if( end > l) {
			      end=l;
			    }
			    
			    if(s.substring(i,end).equals(w)) {
			      
			      if(i>0) {
			        str = str + s.charAt(i-1);
			      }
			      
			      if(i+w.length() <l) {
			        str = str + s.charAt(end);
			      }
			      
			    }
			   
			  }
			  System.out.println(str);
		}

	}
