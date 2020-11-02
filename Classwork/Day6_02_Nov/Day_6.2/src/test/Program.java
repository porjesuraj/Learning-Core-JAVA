package test;

import java.util.Scanner;

public class Program {

	enum Color{
		RED,GREEN,BLUE
	}
	
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
		
	System.out.println("Enum element Name : ");
	
	String str = sc.nextLine();
	
	Color c1 = Color.valueOf(str.toUpperCase());
		
	
	
	
	
		String name = c1.name();
		int ordinal = c1.ordinal();
		System.out.printf("%-10s%-5d \n ", name,ordinal);
	}

	
	
	
public static void main3(String[] args) {
		
		//String name = Color.BLUE.name();
		//int ordinal = Color.BLUE.ordinal();
		
	//Color c1 = Color.BLUE; 
	
	Color[] colors = Color.values();
	for(Color c1 : colors )
	{
		String name = c1.name();
		int ordinal = c1.ordinal();
		System.out.printf("%-10s%-5d \n ", name,ordinal);
	}

	
	}
public static void main2(String[] args) {
		
		String name = Color.GREEN.name();
		int ordinal = Color.GREEN.ordinal();
		
		System.out.printf("%-10s%-5d \n ", name,ordinal);
	
	
		

	}
	public static void main1(String[] args) {
		
		String name = Color.RED.name();
		int ordinal = Color.RED.ordinal();
		
		System.out.printf("%-10s%-5d \n ", name,ordinal);
	
	
		

	}
	
	
	

}
