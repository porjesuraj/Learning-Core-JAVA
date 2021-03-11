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
		
		sb.reverse();
		
		System.out.print(" " +  sb.toString() + " ");  
	}
	
	System.out.println();
	
	
	}
	 

}


/*.5.(Displaying a Sentence with Its Words Reversed) Write an
application that inputs a line of
text, tokenizes the line with String method split and outputs
the tokens in reverse order. Use space
characters as delimiters. */










