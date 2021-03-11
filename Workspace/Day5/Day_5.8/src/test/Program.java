package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int number = 10;//OK
		//number = 20; // Not OK
		System.out.println("Number : " + number);
		
		System.out.println("Num2 : ");
		
		final int number2 = sc.nextInt();
		
		System.out.println("Number : " + number2);
	}
	public static void main3(String[] args) {
		final int number = 10;//OK
		//number = 20; // Not OK
		System.out.println("Number : " + number);
	}
	public static void main2(String[] args) {
		final int number;
		number = 10;
		System.out.println("Number : " + number);
	}
	
	public static void main1(String[] args) {
		final int number = 10;
		//number = number + 1;
		System.out.println("Number : " + number);
	}
}
	

            