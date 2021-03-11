package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}catch( ArithmeticException ex) {
			System.out.println("ArithmeticException");
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}catch( InputMismatchException ex ) {
			System.out.println("InputMismatchException");
			ex.printStackTrace();
		}
		sc.close();
	}
}
