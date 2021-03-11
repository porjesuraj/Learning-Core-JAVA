package test;

public class Date {
	
	private int month;
	private int day;
	private int year;
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	
}



/*
Q.3 Create a class called Date that includes three instance
variables—a month (type int), a day (type int) and a year (type
int). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct.
Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month,
day and year separated by forward
slashes (/).
Write a test application named DateTest that demonstrates class
Date’s capabilities.
*/