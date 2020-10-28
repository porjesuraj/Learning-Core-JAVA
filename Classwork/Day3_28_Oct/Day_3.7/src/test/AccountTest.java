package test;

import java.util.Scanner;

public class AccountTest {
	
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		int choice = sc.nextInt();
		return choice;
		
	}
	

	public  void acceptRecords(  Account account) {

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
		
	
		
	
	}
	
	public  void printRecords(Account account)
	{
		/*
		 * System.out.println("Number	:	"+account.getNumber());
		 * System.out.println("Type	:	"+account.getType());
		 * System.out.println("Balance	:	"+account.getBalance());
		 */
		System.out.println("Account id : " + account.getNumber() + " \n account type : " + account.getType() + " \n account balance : " + account.getBalance());
	}
	
	

}
