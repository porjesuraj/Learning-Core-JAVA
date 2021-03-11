package test;

import java.util.Scanner;

public class Program {
	
	public static int  indexOf(char ch,String arr) {
		
		for (int i = 0; i < arr.length(); i++) {
			
			if(arr.charAt(i) == ch)
			return i ; 
			
		}
		
		return -1;
		
		
	}
public static int  lasIindexOf(char ch,String arr) {
		
	System.out.println(arr.length());
	

		for (int i = length; i > -1; i--) {
			
			if(arr.charAt(i) == ch)
			{
				return i ; 
			}
			
		}
		
		return -1;
		
		
	}

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("please enter a string to find char at particular index");
		
		String arr = sc.nextLine();
		
		char ch = 'g';
		
		int index =  Program.indexOf(ch, arr);
		
		
		System.out.println("index of g = " + index);
	
		int lastIndex = Program.lasIindexOf(ch, arr);
		System.out.println("last index  of g = " + lastIndex);
		
	}
	 

}


/*9. Write your own versions of String search methods indexOf and
lastIndexOf*/










