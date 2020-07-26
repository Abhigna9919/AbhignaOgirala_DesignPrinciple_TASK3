package com.epam.calculator;

public class MathOperation 
{
   double num1;
   double num2;
   
   public MathOperation(double num1, double num2)
   {
	   this.num1=num1;
	   this.num2=num2;
   }
   
   public void add()
   {
	   System.out.println(num1+num2);
   }
   
  public void subtract()
   {
	  System.out.println(num1-num2);
   }
   
   public void division()
   {
	   System.out.println(num1/num2);
   }
   
   public void multiply()
   {
	  System.out.println(num1*num2);
   }

}
