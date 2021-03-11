package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {


	public static void main(String[] args)  {

		try(Scanner sc = new Scanner(System.in))
		{
			System.out.print("Name	:	");

			String name = sc.nextLine();
			System.out.print("Emp id	:	");
			int empid = sc.nextInt();
			System.out.print("Emp salary	:	");
			float salary = sc.nextFloat();

			System.out.println("Name : " + name + " \n Empid : " + empid + " \n salary : " + salary);


		}

		

		
	}

	
	
	public static void main3(String[] args) throws IOException {

		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 

			System.out.print("Name	:	");

			String name = reader.readLine();
			System.out.print("Emp id	:	");
			int empid = Integer.parseInt(reader.readLine());
			System.out.print("Emp salary	:	");
			float salary = Float.parseFloat(reader.readLine());

			System.out.println("Name : " + name + " \n Empid : " + empid + " \n salary : " + salary);

	}

	
	
	
	
	
	
	
	public static void main2(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Name	:	");

		String name = sc.nextLine();
		System.out.print("Emp id	:	");
		int empid = sc.nextInt();
		System.out.print("Emp salary	:	");
		float salary = sc.nextFloat();

		System.out.println("Name : " + name + " \n Empid : " + empid + " \n salary : " + salary);

	}

	public static void main1(String[] args) {

		String name = JOptionPane.showInputDialog("Enter Name");

		int empid = Integer.parseInt(JOptionPane.showInputDialog("Enter Emp id"));

		float salary = Float.parseFloat(JOptionPane.showInputDialog("Enter salary"));

		System.out.println("Name : " + name + " \n Empid : " + empid + " \n salary : " + salary);

	}

}
