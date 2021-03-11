package test;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Program {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		System.out.println("inputs a telephone number as a string in the form (555) 555-5555.");
		
		String delim = "() -";
		
		StringTokenizer stk = new StringTokenizer(sc.nextLine(),delim,false );
		
		String[] tele = new String[3];
		
		
		String token ;
		int i = 0; 
	while(stk.hasMoreElements())
	{   
		token = stk.nextToken();
		System.out.println(token);
		
		tele[i] = token; 
		
		i++;
	}
		
	String phoneNumber = tele[1] + tele[2];
		
	String areaCode = tele[0];
	
	System.out.println("area code  = " + areaCode + " phone number = " + phoneNumber);
	}
	
	   
	 

}


/*. (Tokenizing Telephone Numbers) Write an application that
inputs a telephone number as a string in the form (555) 555-
5555. The application should use method split to extract the
area code as a token, the first three digits of the phone number
as a token and the last four digits of the phone number as a
token. The seven digits of the phone number should be
concatenated into one string. Both the area code and the phone
number should be printed. Remember that you’ll have to
change delimiter characters during the tokenization process. */










