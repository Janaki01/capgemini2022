package com.demo.Day4;
import java.util.Scanner;
public class Divisibleby235 {

    	public static void main(String args[]) {
    			
    		        int i=5,count=0;
    		        while(true)
    		        {
    		            if(i%2==0&&i%3==0&&i%5==0)
    		            {
    		                System.out.print(i+" ");
    		                count++;
    		            }
    		            i++;
    		            if(count==5)
    		            break;
    		        }
    		    }
    		}