package test;

public class Account implements Comparable<Account> {

	private int number;
	private String type;
	private float amount;
	public Account(int number, String type, float amount) {
		super();
		this.number = number;
		this.type = type;
		this.amount = amount;
	}
	
	public Account() {
		this(0,"",0);
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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return String.format("%-5d%-15s%-10.2f",this.number, this.type, this.amount);
	}

	@Override
	public int compareTo(Account o) {
		
		return this.number = o.number;
	}

	
	
	
}
