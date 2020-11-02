package org.sunbeam.dac.d3.lib;

public class Person {
	
	private String name;
	private Date birthDate;
	private Address address; 

	
	public Person() {
	
		this.name = new String();
		this.birthDate = new Date();
		this.address = new Address();
	}


	public Person(String name, Date birthDate, Address address) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + ", address=" + address + "]";
	}
	
	
}
