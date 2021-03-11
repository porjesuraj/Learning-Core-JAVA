package test;

import java.util.Scanner;

class Test{
	
	final int num1;
	
  public static final int num2 = 20;
	
	public Test()
	{
		this.num1 = 10;
	}
	public void print()
	{
		System.out.println("num1 : " + this.num1);
		System.out.println("num1 : " + this.num2);
	}
	
}
public class Program {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.print();
		
	}
	
}
	

            