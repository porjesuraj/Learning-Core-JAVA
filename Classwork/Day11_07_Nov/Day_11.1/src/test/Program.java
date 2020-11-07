package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
		System.out.println("F.Q.CLass Name : ");	
		String className = sc.nextLine();
	
		Class<?> c = Class.forName(className);
		System.out.println(c.toString());
		System.out.println(c.getFields());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	public static void main2(String[] args) {
		
		Class<?> c = Number.class;
		
		System.out.println(c.getName());
	}
	
	
	public static void main1(String[] args) {
		
		Integer number = new Integer(0);
		
		Class<? extends Number> c =  number.getClass();
		 
		System.out.println(c.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
