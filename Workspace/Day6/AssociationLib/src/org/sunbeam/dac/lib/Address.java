package org.sunbeam.dac.lib;

public class Address {
	private String cityName;
	private String statename;
	private int pincode;

	public Address() {
		this.cityName = "";
		this.statename = "";
		this.pincode = 0;	
	}

	public Address(String cityName, String statename, int pincode) {
		super();
		this.cityName = cityName;
		this.statename = statename;
		this.pincode = pincode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", statename=" + statename + ", pincode=" + pincode + "]";
	}
	
	
	
}
