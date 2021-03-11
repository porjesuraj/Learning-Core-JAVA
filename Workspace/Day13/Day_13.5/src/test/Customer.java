package test;

public class Customer {
	
	private String name;
	private String email;
	private String contactNumber;
	public Customer(String name, String email, String contactNumber) {
		super();
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	
	
	public Customer() {
		this("","","");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", contactNumber=" + contactNumber + "]";
	}
	
	

}
