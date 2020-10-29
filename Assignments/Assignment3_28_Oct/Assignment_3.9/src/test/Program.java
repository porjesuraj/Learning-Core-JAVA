package test;

public class Program {

	public static void main(String[] args) {
		
		CustomerCreditInfo ci = new CustomerCreditInfo(1, 1000.0, 200.0, 5, 1000);
		
		CreditTest test = new CreditTest();
		
		test.checkNewBalance(ci);
		
		
		
		

	}

}
