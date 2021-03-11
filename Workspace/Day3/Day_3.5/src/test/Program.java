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

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account no");
		account.setNumber(sc.nextInt());
		
		System.out.println("enter account type");
				sc.nextLine();
		account.setType(sc.nextLine());
		
		System.out.println("enter account balance");
		account.setBalance(sc.nextFloat());
		
		account.printecord();
		
	}

	public static void main2(String[] args) {

        Account account = new Account();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number	:	");
		int number  = sc.nextInt();
		account.setNumber(number);
		
		System.out.print("Type	:	");
		sc.nextLine();
		String type = sc.nextLine();
		account.setType(type);
		
		System.out.print("Balance	:	");
		float balance = sc.nextFloat();
		account.setBalance( balance );
		
		System.out.println("Number	:	"+account.getNumber());
		System.out.println("Type	:	"+account.getType());
		System.out.println("Balance	:	"+account.getBalance());
		
		
		
		
		

	}
	
	
	
	public static void main1(String[] args) {

     Account account = new Account();
		
		account.setNumber(1001);
		account.setType("Saving");
		account.setBalance(10000);
		
		int number = account.getNumber();
		System.out.println("Number	:	"+number);
		
		String type = account.getType();
		System.out.println("Type	:	"+type);
		
		float balance = account.getBalance();
		System.out.println("Balance	:	"+balance);
		

	}

}
