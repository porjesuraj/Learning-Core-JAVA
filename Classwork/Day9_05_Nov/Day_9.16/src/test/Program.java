package test;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Number : ");
			
			System.out.println("Number : " + Integer.parseInt(new StringBuilder(String.valueOf(sc.nextInt())).reverse().toString()));
		}
	
	}
	
	
	public static void main1(String[] args) {

		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Number : ");
			int number = sc.nextInt();
			
			String strNumber = String.valueOf(number);
			
			StringBuilder sb = new StringBuilder(strNumber);
			
		//	StringBuffer sb = new StringBuffer(strNumber);
			sb.reverse();
			
			strNumber = sb.toString();
			
			number = Integer.parseInt(strNumber);
			System.out.println("Number : " + number);
			
		}
	
	}
}