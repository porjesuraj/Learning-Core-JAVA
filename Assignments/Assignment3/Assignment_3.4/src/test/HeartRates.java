package test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HeartRates {
	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;
	public HeartRates(String firstName, String lastName, int day, int month, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public HeartRates()
	{this.firstName = "";
	this.lastName = "";
		this.day = 1;
		this.month = 1;
		this.year = 1900;
		
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
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getPersonAge(HeartRates hr)
	{
		int birthYear = hr.year;
		
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int currentyear = calendar.get(Calendar.YEAR);
		
		
		//int currentyear = new Date();
		

		int age = currentyear - birthYear;
		
		return age;
	}
	
	public int getMaxHeartRate(HeartRates hr)
	{
		int age = this.getPersonAge(hr);
		
		int maxHeartRate = 220 - age;
		
		return maxHeartRate;
	}
	public double getPersonTargetHeartRate(HeartRates hr)
	{
		int maxRate = getMaxHeartRate(hr);
		
		double targetRate = 0.85 * maxRate;
		
		return targetRate; 
		
	}
}



/*
Create a class called HeartRates. The class attributes should
include the person’s first name, last name and date of birth
(consisting of separate attributes for the month, day and year
of birth). Your class should have a constructor that receives
this data as parameters. For each attribute provide set and get
methods. 
The class also should include a method that calculates
and returns the person’s age (in years),
 a method that
calculates and returns the person’s maximum heart rate and
 a
method that calculates and returns the person’s target
heart rate.
 Write a Java application that prompts for the
person’s information, instantiates an object of class HeartRates
and prints the information from that object—including the
person’s first name, last name and date of birth—then calculates
and prints the person’s age in (years), maximum heart
rate and target-heart-rate range.
*/