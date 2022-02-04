package com.demo.Day6;

class Number implements Runnable 
{ 
  public void run() { 
    
        for(int i=1;i<=10;i++) 
        	 try  { 
        {                   
        	if(i==6)
          Thread.sleep(5000);          
          System.out.println(i); 
        } 
        } 
       catch(InterruptedException e) 
           { 
             System.out.println(e); 
           } 
    } 
} 
 
public class ThreadControlMech 
{ 
  public static void main(String [] args) 
   { 
     Number n = new Number(); 
     Thread thread = new Thread(n); 
     thread.start(); 
   } 
}

