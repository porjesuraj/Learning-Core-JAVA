package test;

public class CustomerTest {
	
	
	public double GetInterestRate(Customer customer)
	{
		double interest = 0;
		if(customer.getAmount() < 2000 && customer.getYear() >= 2)
		{
			interest = 5; 
		} else if(customer.getAmount() >= 2000 && customer.getAmount() < 6000 && customer.getYear() >= 2) {
			interest = 7;
		}else if(customer.getAmount() > 6000 && customer.getYear() >= 1) {
			
			interest = 8;
		} else if(customer.getYear() >= 5)
		{
			interest = 10;
		} else
		{
			interest = 3;
		}
		
		return interest;
           		
	}
	
	public void GetMaturityAmount(Customer customer)
	{
		double interest = 0;
		if(customer.getAmount() < 2000 && customer.getYear() >= 2)
		{
			interest = 5; 
		} else if(customer.getAmount() >= 2000 && customer.getAmount() < 6000 && customer.getYear() >= 2) {
			interest = 7;
		}else if(customer.getAmount() > 6000 && customer.getYear() >= 1) {
			
			interest = 8;
		} else if(customer.getYear() >= 5)
		{
			interest = 10;
		} else
		{
			interest = 3;
		}
		
		
		
		
		double ratePart = 1 + (interest/100); 
		
		
		double compoundInt = customer.getAmount() * Math.pow(ratePart, customer.getYear()); 
		
		
		double maturityAount = customer.getAmount() + compoundInt;
		
		System.out.println("Maturity amount on amount " + customer.getAmount() + " after " + customer.getYear() + " years is " + maturityAount);
	}
	

}











