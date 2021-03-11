package test;

import java.util.Scanner;

class Account{
	
	private int number;
	private String type;
	private float balance; 
	
	public Account()
	{
		this(0,"",0.0f); //Constructor Chaining
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

	
}



public class Program {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice = 0;
		Account account = new Account();
		
		while((choice = Program.menuList()) != 0)
		{
			switch (choice) {
			case 1:
				Program.acceptRecords(account);
				
				break;
			case 2: 
				Program.printRecords(account);
				break;

			default:
				System.out.println("incorrect choice");
				break;
			}
		}
	
 }

	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		int choice = sc.nextInt();
		return choice;
		
	}
	

	public static void acceptRecords(  Account account) {

        //Account account = new Account();
		
		
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
	
	public static void printRecords(Account account)
	{
		System.out.println("Account id : " + account.getNumber() + " \n account type : " + account.getType() + " \n account balance : " + account.getBalance());
	}
	
	
	

}
