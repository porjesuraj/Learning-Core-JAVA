package test;

public class SavingsAccount {
	static double annulInterestRate ;
	private double savingsBalance; // amount the saver currently has on deposit.
	
	static {
		annulInterestRate = 1.0;
	}
	
	
	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}


	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}


	public static double getAnnulInterestRate() {
		return annulInterestRate;
	}


	public static void setAnnulInterestRate(double annulInterestRate) {
		SavingsAccount.annulInterestRate = annulInterestRate;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

}



/*
Q.7 (Savings Account Class)
Create class SavingsAccount.
Use a static variable annualInterestRate to store the annual
interest rate for all account holders. Each object of the class
contains a private instance variable savingsBalance indicating
the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly
interest by multiplying the savingsBalance by annualInterestRate
divided by 12—this interest should be added to savings-Balance.
Provide a static method modifyInterestRate that sets the
annualInterestRate to a new value. Write a program to test class
SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00,
respectively. Set annualInterestRate to 4%, then calculate the
monthly interest for each of 12 months and print the new

*/