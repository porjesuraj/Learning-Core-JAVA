package test;

public class Account {

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
		return "Account [number=" + number + ", type=" + type + ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj != null ) {
			Account other = (Account) obj;
			if( this.number == other.number)
				return true;
		}
		return false;
	}
	
	
	
}
