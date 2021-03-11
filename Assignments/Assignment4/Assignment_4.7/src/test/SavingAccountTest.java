package test;

import java.util.Scanner;

public class SavingAccountTest {

 static	Scanner sc = new Scanner(System.in);
	
	public double calculateMonthlyInterest(SavingsAccount sa)
	{
		double monthlyInterest = (sa.getSavingsBalance() * (SavingsAccount.getAnnulInterestRate()/100))/12  ;
		
		double newBalance = sa.getSavingsBalance() + monthlyInterest;
		
		sa.setSavingsBalance(newBalance);
		
		return monthlyInterest;
		
		
	}
	
	public static void modifyInterestRate()
	{
		System.out.println("please enter the new interest rate ");
		
	        SavingsAccount.setAnnulInterestRate(sc.nextDouble());
	}
	
	public  void acceptCustomerInfo(SavingsAccount sa)
	{
		System.out.println("adding  balance amount in account ");
		
		sa.setSavingsBalance(sc.nextDouble());
	}
	
	public void monthlyBalance(SavingsAccount sa,int months)
	{
		
		
		for (int i = 0; i < months; i++) {
			
		 double  monthly =  calculateMonthlyInterest(sa);
		
		System.out.println("monthly interest = " + monthly + " for " + (i + 1) + " month and  new balance  = " + sa.getSavingsBalance() );
		
		
		}
		
		
	}
	
}
