package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program {

	public static void main(String[] args) {
		String str = "1a+2b*3c-4d/5e";
		String delim = "+*-/";
		StringTokenizer stk = new StringTokenizer(str,delim);
		String token = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}
	
	
	
	public static void main5(String[] args) {
		String str = "www.sunbeaminfo.com";
		String delim = ".";
		StringTokenizer stk = new StringTokenizer(str,delim);
		//StringTokenizer stk = new StringTokenizer(str,delim,true);
		String token = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}
	
	
	
	public static void main4(String[] args) {
		String str = "www.sunbeaminfo.com";
		String delim = ".";
		StringTokenizer stk = new StringTokenizer(str,delim);
		String token = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}
	
	public static void main3(String[] args) {
		String str = "SunBeam Institute of Information Technology";
		StringTokenizer stk = new StringTokenizer(str);
		String token = null;
		while( stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
	}// using token class
	
	
	public static void main2(String[] args) {

		String str = "Sun Beam INfo Tech";
		
		StringTokenizer stk = new StringTokenizer(str);
		
		String token = null;
		
		while(stk.hasMoreElements())
		{
			token = (String) stk.nextElement();
			System.out.println(token);
		}
			
	} // using enumeration class

	public static void main1(String[] args) {

		String str = "Sun Beam INfo Tech";
		
		StringTokenizer stk = new StringTokenizer(str);
		
		
		System.out.println("count : " + stk.countTokens());
	}
	
	
  
}
