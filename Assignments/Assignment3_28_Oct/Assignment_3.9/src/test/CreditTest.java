package test;

public class CreditTest {
	
	public void checkNewBalance(CustomerCreditInfo ci)
	{
		
	 double	newBalance = ci.getMonthStartBalance() + ci.getChargedAmount() - ci.getCreditUsed();
	 
	 System.out.println(newBalance);
	 if(newBalance > ci.getCreditLimit())
	 {
		 System.out.println("Credit limit exceeded");
		 
	 }else 
	 {
		 
		System.out.println(ci.toString()); 
	 }
		 
		 
		
	}

}


/*
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this
month
e) allowed credit limit.
The program should input all these facts as integers, calculate
the new balance (= beginning balance+ charges – credits),
display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose
credit limit is exceeded, the program should display
the message "Credit limit exceeded".
*/