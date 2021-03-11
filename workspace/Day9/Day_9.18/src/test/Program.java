package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Validator{
	public static String Name_REGEX = "\\p{Upper}(\\p{Lower}+\\s?)";
	public static boolean validateName( String name ) {
		return name.matches(Name_REGEX);
	}
	public static String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	public static boolean validateEmail( String email ) {
		return email.matches(EMAIL_REGEX);
	}
	public static String MOBILE_REGEX = "\\d{10}";
	public static boolean validateMobile( String mobile ) {
		return mobile.matches(MOBILE_REGEX);
	}
}
	

public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Mobile no	:	");
			String mobile = sc.nextLine();
			if( Validator.validateMobile(mobile))
				System.out.println(mobile);
			else
				System.out.println("Invalid Mobile number");
		}
	}
	
	public static void main5(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Name	:	");
			String name = sc.nextLine();
			if( Validator.validateName(name))
				System.out.println(name);
			else
				System.out.println("Invalid Name");
		}
	}
	
	
	public static void main4(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Email	:	");
			String email = sc.nextLine();
			if( Validator.validateEmail(email))
				System.out.println(email);
			else
				System.out.println("Invalid Email");
		}
	}
	public static void main3(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Email ");
			String email = sc.nextLine();
			
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			
			
			if(email.matches(regex))
			{
				System.out.println(email);
			}
			else
				System.out.println("Invalid email");
		}
	
	}
	public static void main2(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Email ");
			String email = sc.nextLine();
			
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			
			
			
			if(Pattern.matches(regex, email))
			{
				System.out.println(email);
			}
			else
				System.out.println("Invalid email");
		}
	
	}
	
	public static void main1(String[] args) {
	
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Email ");
			String email = sc.nextLine();
			
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			
			Pattern p = Pattern.compile(regex);
			
			Matcher m = p.matcher(email);
			
			if(m.matches())
			{
				System.out.println(email);
			}
			else
				System.out.println("Invalid email");
		}
	
	}
}