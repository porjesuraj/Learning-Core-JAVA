package test;

import java.util.Scanner;

class Account{
	
	private int number;
	private String type;
	private float balance; 
	
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
		
		account.acceptRecord();
		
		account.printecord();
		

	}

}
