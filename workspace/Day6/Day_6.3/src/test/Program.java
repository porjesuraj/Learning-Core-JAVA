package test;

import java.util.Scanner;

enum Day{
	
	//SUN,MON,TUE; ok
	
	SUN(1,"Sunday"),MON(2,"Monday"),TUE(3,"Tuesday"); 
	
	
	
	private int dayNumber;
	private String dayName;
	
	/* individual constructor
	 * private Day(int dayNumber) { this.dayNumber = dayNumber; }
	 *  private Day(String dayName) { this.dayName = dayName; }
	 */
	private Day(int dayNumber, String dayName) {
		this.dayNumber = dayNumber;
		this.dayName = dayName;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	
	@Override
	public String toString()
	{
		return String.format("%-10s%-5d", this.dayName,this.dayNumber);
	}
	
}



public class Program {
	public static void main(String[] args) {
		
		Day[] days = Day.values();
		
		for(Day day : days)
		{
			String name = day.name();
			int ordinal = day.ordinal();
			int dayNumber = day.getDayNumber();
			String dayName = day.getDayName();
			
			System.out.println(name+"	"+ordinal+"	"+ day.toString());
		}
		
		
		}
	
	
	
public static void main1(String[] args) {
	
	Day[] days = Day.values();
	
	for(Day day : days)
	{
		String name = day.name();
		int ordinal = day.ordinal();
		int dayNumber = day.getDayNumber();
		String dayName = day.getDayName();
		
		System.out.println(name+"	"+ordinal+"	"+dayName+"	"+dayNumber);
	}
	
	
	}

	
}