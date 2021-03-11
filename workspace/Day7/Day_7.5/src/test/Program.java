package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}catch( Exception ex ) {
			System.out.println(ex.getMessage()); //DND
		}
	}
	public static void main3(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}catch( ArithmeticException ex ) {
			System.out.println("ArithmeticException");
		}catch( RuntimeException ex ) {
			System.out.println("RuntimeException");
		}catch( Exception ex ) {
			System.out.println("Exception");
		}
	}
	public static void main2(String[] args) {
		//public InterruptedException(String s)
		InterruptedException ex1 = new InterruptedException("Interrupted"); //OK
		
		Exception ex2 = new InterruptedException("Interrupted"); //OK : Upcasting
	}
	public static void main1(String[] args) {
		//public NullPointerException(String s)
		NullPointerException ex1 = new NullPointerException("NULL Pointer Exception");	//Ok
		
		RuntimeException ex2 = new NullPointerException("NULL Pointer Exception"); //OK : Upcasting
		
		Exception ex3 = new NullPointerException("NULL Pointer Exception"); //OK : Upcasting
	}
}
