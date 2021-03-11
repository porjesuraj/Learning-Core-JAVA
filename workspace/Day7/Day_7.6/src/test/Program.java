package test;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//try with resource
		try( Scanner sc = new Scanner(System.in);){
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
			
		}catch( Exception ex ) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main1(String[] args) {
		Scanner sc = null;	//Local
		try {
			System.out.println("Inside try");
			sc = new Scanner(System.in);
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			if( num2 == 0 ) 
				throw new ArithmeticException("divide by zero exception");
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
			
			System.exit(0);
		}catch( Exception ex ) {
			System.out.println("Inside catch");
			System.out.println(ex.getMessage());
			System.exit(0);
		}finally {
			System.out.println("Inside finally");
			sc.close();
		}
	}
}
