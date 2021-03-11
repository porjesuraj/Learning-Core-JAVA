package test;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter employee name ");
		
		String Name = sc.nextLine();
		
		System.out.println("please enter employee id");
		int id = sc.nextInt();
		
		System.out.println("please enter employee salary ");
		float salary = sc.nextFloat();
		
		System.out.println("EMployee id : " + id + " Name : " + Name + " Salary : " + salary);
		
	}
	
	

}


