package test;

import java.util.Scanner;

public class Program{
	static Scanner  sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		int choice ; 
		ShapeTest test = new ShapeTest();
		
		while((choice = ShapeTest.menuList()) != 0)
		{
			
			
			test.setShape(ShapeFactory.getInstance(choice));
			
			test.acceptRecord();
			
			test.printRecord();
			
			
			
			
			
			
		}
		
		
	}
}



