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

		//new Account(); //Annonymous  instance
		
		Account account = new Account();
		
		
		
		account.printecord();
		

	}
	
	
	
	public static void main1(String[] args) {

		//new Account(); //Annonymous  instance
		
		Account account = new Account(100,"Loan",10000);
		
		
		
		account.printecord();
		

	}

}
