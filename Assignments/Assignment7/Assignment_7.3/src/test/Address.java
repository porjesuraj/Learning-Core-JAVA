package test;

public class Address implements Comparable<Address> {

	private String state;
	private String city;
	private int pincode;
	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	@Override
	public int compareTo(Address o) {
		
		
		return this.getState().compareTo(o.getState());
	}
	
	
}
