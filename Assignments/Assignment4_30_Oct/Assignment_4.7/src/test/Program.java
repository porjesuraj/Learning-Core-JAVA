package test;

public class Program {

	public static void main(String[] args) {
		
		SavingAccountTest test = new SavingAccountTest();
		SavingsAccount saver1 = new SavingsAccount();
	 	
		SavingsAccount saver2 = new SavingsAccount();
		
		
		 test.acceptCustomerInfo(saver1); test.acceptCustomerInfo(saver2);
		 test.modifyInterestRate();
		 
		 test.monthlyBalance(saver1,12);
		 
		 test.monthlyBalance(saver2,12);
		 
		
		test.modifyInterestRate();
		
test.monthlyBalance(saver1,1);
		
		test.monthlyBalance(saver2,1);
		
	}

}
