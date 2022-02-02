package com.demo.Day4;
import java.util.*;
public class Menu {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String con="";
        do
        {
            System.out.println("1.Add\n2.Sub");
            System.out.println("Enter your choice");
            int i=sc.nextInt();
            System.out.println("Enter the numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int res=0;
            if(i==1)
            res=a+b;
            if(i==2)
            res=a-b;
            System.out.println("the result is:"+res);
            System.out.println("press y or Y to continue!");
            con=sc.next();
        }while(con.equals("y")||con.equals("Y"));
        System.out.println("bye");
    }
}