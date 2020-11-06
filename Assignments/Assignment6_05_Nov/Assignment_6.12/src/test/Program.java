package test;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Program {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		System.out.println("please enter website domain name ");
		
		String delim = ".";
		
		StringTokenizer stk = new StringTokenizer(sc.nextLine(),delim,false );
		
		String[] token  = new String[stk.countTokens()];
		int i = 0;
	while(stk.hasMoreElements())
	{
		token[i] = stk.nextToken();
		
		System.out.println(token[i]);
		
		i++;
	}
	
	 

}

	
}

/*12. Accept a website name as a command line argument & display
its constituent parts.
i.e. www.yahoo.com
www
yahoo
com*/










