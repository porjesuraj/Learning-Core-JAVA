package test;

public class Date implements Comparable<Date> {
	
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
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
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		Date other = null;
		if(obj instanceof Date)
		other = (Date) obj;
		
		if(this.day == other.day && this.month == other.month && this.year == other.year)
		return true;
	
		return false;
	
   }
	@Override
	public int compareTo(Date other) {
		
		
		return  this.year - other.year;
	}
}
