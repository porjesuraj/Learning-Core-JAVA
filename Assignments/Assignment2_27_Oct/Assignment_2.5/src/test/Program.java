package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;;
		do
		{
			System.out.println("please enter your choice \n 1. Add \n 2. Sub \n 3. Mult \n 4. Div \n");
	     int choice = sc.nextInt();
			
		System.out.println("please enter  number one ");
		int num1 = sc.nextInt();
		System.out.println("please enter  number two");
		int num2 = sc.nextInt();
		
		switch (choice) {
		   case 1:
			   int add = 	Program.Add(num1, num2);
			   System.out.println( num1  + " + " + num2 + "  = " + add);
			break;
          case 2:
        	  int sub = 	Program.Sub(num1, num2);
        	  System.out.println(num1  + " - " + num2 + "  = " + sub);
			break;
          case 3:
        	  int mult = 	Program.Mult(num1, num2);
        	  System.out.println( num1  + " * " + num2 + "  = " + mult);
  			break;
          case 4:
        	  int div = 	Program.Div(num1, num2);
        	  System.out.println(num1  + "/" + num2 + "= " + div);
  			break;

		default:
			 System.out.println("wrong choice");
			break;
		}
		
		System.out.println("do you want to continue? enter true if yes");
         
		ischoice = sc.nextBoolean();
	
			
		} while (ischoice);
		
		
				
	
	
	
	
	
	
	
	
	
	    }
	
	public static int Add(int x, int y)
	{
		return x + y;
	}
	public static int Sub(int x, int y)
	{
		return Math.abs(x - y);
	}
	public static int Mult(int x, int y)
	{
		return x * y;
	}
	public static int Div(int x, int y)
	{
		return x / y;
	}
		
}	




/*
 * 4. Write a program for addition, subtraction, multiplication and
division of two numbers.
 */
