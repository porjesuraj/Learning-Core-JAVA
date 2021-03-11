package test;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Program {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		System.out.println("please input a sentence ");
		
		String delim = " ";
		
		StringTokenizer stk = new StringTokenizer(sc.nextLine(),delim,false );
		
		String[] token  = new String[stk.countTokens()];
		int i = 0;
	while(stk.hasMoreElements())
	{
		token[i] = stk.nextToken();
		
		
		
		i++;
	}
	
	for(String t : token)
	{
		StringBuilder sb = new StringBuilder(t);
		
		if(sb.charAt(0) == 'b' )
		  System.out.print(" " +  sb.toString() + " ");  
	}
	
	System.out.println();
	
	
	}
	 

}


/*7. (Tokenizing and Comparing Strings) Write an application that
reads a line of text, tokenizes the line using space characters
as delimiters and outputs only those words beginning with the
letter "b".*/










