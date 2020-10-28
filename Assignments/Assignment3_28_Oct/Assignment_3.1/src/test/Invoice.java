package test;

public class Invoice {
	private String number;
	private String description;
	private int itemQuantity;
	private double pricePerItem;
	
	public Invoice(String number, String description, int itemQuantity, double pricePerItem) {
		super();
		this.number = number;
		this.description = description;
		this.itemQuantity = itemQuantity;
		this.pricePerItem = pricePerItem;
	}
	
	public Invoice()
	{
		this("","",0,0.0);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	

}
