package test;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("String 1 : ");
		String str1 = sc.nextLine();
		
		System.out.println("String 2 : ");
		String str2 = sc.nextLine();
		
	int compare =	str1.compareTo(str2);
	
	
	if(compare > 0)
	System.out.println("str1 is greater than str2");
	 else if(compare < 0)
	System.out.println("str1 is less than str2");
	else 
	System.out.println("str1 is equal to  str2");
	

	}

}
