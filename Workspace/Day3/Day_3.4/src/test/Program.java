package test;

import java.util.Scanner;

class Account{
	
	private int number;
	private String type;
	private float balance; 
	
	public Account()
	{
		this(001,"Saving",5000); //Constructor Chaining
	}
	
	public Account(int number, String type, float balance) {
		
		this.number = number;
		this.type = type;
		this.balance = balance;
	}

	public void acceptRecord()
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("account Type	:	");

			this.type = sc.nextLine();
			System.out.print("account no	:	");
			this.number = sc.nextInt();
			System.out.print("account balance	:	");
			this.balance = sc.nextFloat();

		}
		
	}
	
	public void printecord()
	{
		System.out.println("Account id : " + number + " \n account type : " + this.type + " \n account balance : " + this.balance);
		
	}
}



public class Program {
public static void main(String[] args) {

		
		
		Account account = new Account();
		
		
		account.printecord();
		

	}
	
	
	
public static void main3and4(String[] args) {

		
		
		Account account = null; //account => null reference variable/ null object
		/*
		 * if(account != null) { account.printecord();
		 * 
		 * }
		 */
		
		account = new Account();
		account.printecord();
		

	}
	
	
public static void main2(String[] args) {

		
		
		Account account = null; //account => null reference variable/ null object
		
		
		
		account.printecord(); // error: NullPointerException
		

	}
	public static void main1(String[] args) {

		
		
		Account account;
		
		account.printecord(); // compile time error
		

	}
	
	

}
