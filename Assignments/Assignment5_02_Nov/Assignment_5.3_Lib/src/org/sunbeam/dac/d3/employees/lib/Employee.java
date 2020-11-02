package org.sunbeam.dac.d3.employees.lib;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private int SSN;

	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.SSN = 0;
	}
	
	
	
	public Employee(String firstName, String lastName, int sSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	} 
	
	
	
	public abstract void earnings(); 

	
}
