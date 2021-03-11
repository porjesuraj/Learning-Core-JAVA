package assignment;

import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;
import java.util.Scanner;

public class Program {

	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
	System.out.println("please enter array length");
		
		final int length = sc.nextInt();
		
		Array<String> string_Array = new Array<>(String.class, length);
		
		
		System.out.print("Generic Array<String> : " + " ");

		for (int i = 0; i < length; i++) {
			
			string_Array.set(i, String.valueOf((char)(i + 65)));
		}
		
		System.out.print(string_Array);
	}
	
	public static void main1(String[] args) throws NoSuchFieldException, SecurityException {
		
		System.out.println("please enter array length");
		
		final int length = sc.nextInt();
		
	Array<Integer> int_Array = new Array<>(Integer.class, length);
	
	System.out.print("generic Array<Integer> : " +  " ");
	
	for (int i = 0; i < length; i++) 
		int_Array.set(i, i + 10);
		
	System.out.print(int_Array);
	

	}

}



/* generic array by reflection */