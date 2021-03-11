package test;

public class Customer {
	
	private double amount ;
	private int year;
	
	
	
	public Customer(double amount, int year) {
		super();
		this.amount = amount;
		this.year = year;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	} 

	
	
}


/*Give the amount deposited and the number of years, write a
program to calculate the money in the customer's account at the
end of the specified time.*/