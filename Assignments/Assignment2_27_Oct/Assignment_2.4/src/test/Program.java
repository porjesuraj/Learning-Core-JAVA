package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number one ");
		int num1 = sc.nextInt();
		System.out.println("please enter a number two");
		int num2 = sc.nextInt();
				
	int add = 	Program.Add(num1, num2);
	int sub = 	Program.Sub(num1, num2);
	int mult = 	Program.Mult(num1, num2);
	int div = 	Program.Div(num1, num2);
	
	System.out.println( num1  + " + " + num2 + "  = " + add);
	System.out.println(num1  + " - " + num2 + "  = " + sub);
	System.out.println( num1  + " * " + num2 + "  = " + mult);
	System.out.println(num1  + "/" + num2 + "= " + div);
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
