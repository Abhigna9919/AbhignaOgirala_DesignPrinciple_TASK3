package com.epam.application;

import com.epam.calculator.MathOperation;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       int ch=0;
       while(ch!=-1)
       {
           System.out.println("Enter two numbers a and b:\n");
           double a=sc.nextDouble();
           double b=sc.nextDouble();
           MathOperation ob=new MathOperation(a,b);
       System.out.println("Select an operation from below\n");
       System.out.println("Enter\n 1.Add\n2.Subtract\n3.Divide\n4.Multiply\n Type -1 to exit\n");
       ch=sc.nextInt();
       switch(ch)
       {
       case 1:
    	   ob.add();
    	   break;
       case 2:
    	   ob.subtract();
    	   break;
       case 3:
    	   ob.division();
    	   break;
       case 4:
    	   ob.multiply();
    	   break;
       case -1:
    	   System.out.println("Exiting...");
    	   System.exit(0);
    	   break;
       default:
    	   System.out.println("Wrong input!\n");
    	   break;
       }
       }
       sc.close();
    }
}
