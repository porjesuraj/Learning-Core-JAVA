package org.sunbeam.dac.lib;

public class Person {

	private String name;
	private Date joinDate; //null
	private Address currentAddress; //null
	
	//calling method on null object , gives  nullpointer exception
	
	public Person() {
		this.name = new String();
		this.joinDate = new Date();
		this.currentAddress = new Address();
	}
	public Person(String name, Date joinDate, Address currentAddress) {
		this.name = name;
		this.joinDate = joinDate;
		this.currentAddress = currentAddress;
	}
	public Person(String name,int day, int month, int year, String cityName, String stateName, int pinCode) {
		this.name = name;
		this.joinDate = new Date(day, month, year);
		this.currentAddress = new Address(cityName, stateName, pinCode);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", joinDate=" + joinDate + ", currentAddress=" + currentAddress + "]";
	}
	
	
	
}
