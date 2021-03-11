package test;

public class Account{
	
	private int number;
	private String type;
	private float balance; 
	
	public Account()
	{
		this(0,"",0.0f); //Constructor Chaining
	}
	
	public Account(int number, String type, float balance) {
		
		this.number = number;
		this.type = type;
		this.balance = balance;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	
}
