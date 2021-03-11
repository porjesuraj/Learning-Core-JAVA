package test;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("String 1 : ");
		String str1 = sc.nextLine();
		
		System.out.println("String 2 : ");
		String str2 = sc.nextLine();
		
		System.out.println("number of characters to be compared ");
		int noOfchar = sc.nextInt();
		
		System.out.println("starting index of comparsion ");
		int compareIndex = sc.nextInt();
		
		str1.regionMatches(true, 0, str2, compareIndex, noOfchar);
		
	int compare =	str1.compareTo(str2);
	
	
	if(str1.regionMatches(true, 0, str2, compareIndex, noOfchar))
	System.out.println("str1 is equal to  str2");
	
	else 
	System.out.println("str1 is not  equal to  str2");
	

	}

}


/*2.(Comparing Portions of Strings) Write an application that uses
String method regionMatches to compare two strings input by the
user. The application should input the number of characters
to be compared and the starting index of the comparison. The
application should state whether the strings are equal. Ignore
the case of the characters when performing the comparison. */










