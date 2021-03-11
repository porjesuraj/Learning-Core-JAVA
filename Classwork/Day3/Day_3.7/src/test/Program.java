package test;

import java.util.Scanner;




public class Program {
	
	
	public static void main(String[] args) {
		
		int choice = 0;
		Account account = new Account();
		AccountTest test = new AccountTest();
		
		while((choice = AccountTest.menuList()) != 0)
		{
			switch (choice) {
			case 1:
				test.acceptRecords(account);
				
				break;
			case 2: 
				test.printRecords(account);
				break;

			default:
				System.out.println("incorrect choice");
				break;
			}
		}
	
 }

	
	
	

}
