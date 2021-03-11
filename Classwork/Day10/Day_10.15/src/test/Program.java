package test;

class Date{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
		this(0,0,0);
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
	
}


public class Program { // Program.class
	public static void main(String[] args) {
		
		Date dt1 = new Date(1, 1, 1994);
		
		System.out.println("date 1 : " + dt1.toString());
		Date dt2 = dt1; //shallow copy of references, get same reference 
		System.out.println("date 2 : " + dt2.toString());
		dt2.setDay(2);
		
		dt2.setYear(1995);
		
		System.out.println("date 1 after changes in dt2 : " + dt1.toString());
		System.out.println("date 2  after changes: " + dt2.toString());
	
	}
	
}
