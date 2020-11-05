package test;

import java.util.Arrays;
import java.util.Date;

import p1.A;

class B{
	public static String str = "Hello";
}
public class Program {
	public static String str = "Hello"; 
	public static void main(String[] args) {
	
		 String str = "Hello"; 
		 System.out.println(A.str == B.str);	//true
			System.out.println(A.str == Program.str);//true
			System.out.println(A.str == str);//true
		 
			System.out.println(B.str == Program.str);	//true
			System.out.println(B.str == str);//true
			
			System.out.println(Program.str == str);//true
			
		
	
	}
}
