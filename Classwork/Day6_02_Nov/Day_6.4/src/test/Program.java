package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Program {
	public static void main(String[] args) {
		Date date = new Date();
		
		int day = date.getDay();
		int month = date.getMonth();
		int year = date.getYear();
		
		System.out.println(day + "/" + month + "/" + year);	
		
		
		
		}
	
	
	
	
	
	public static void main4(String[] args) {
		// to find system date
		
		LocalTime lt = LocalTime.now();
	
		//Date time = c.getTime(); 
		
		int hour = lt.getHour();
		int minute = lt.getMinute();
		int second = lt.getSecond();
		int nanosecond = lt.getNano();
		
		
		System.out.println(hour + ":" + minute + ":" + second + ":" + nanosecond);	
		
		}
	public static void main3(String[] args) {
		// to find local date

		LocalDate ld = LocalDate.now();
		
		int day = ld.getDayOfMonth();
		int month = ld.getMonthValue();
		int year = ld.getYear();
		
		System.out.println(day + "/" + month + "/" + year);	
		
		
		
		}
		
	
public static void main2(String[] args) {
		// to find system date
		
		Calendar c = Calendar.getInstance();
	
		//Date time = c.getTime(); 
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND);
		
		
		System.out.println(hour + ":" + minute + ":" + second + ":" + millisecond);	
		
		}
	
	
	public static void main1(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		
		int day = c.get(Calendar.DATE);
		int month = c.get(Calendar.MONTH)  + 1;
		int year = c.get(Calendar.YEAR);
		
		System.out.println(day + "/" + month + "/" + year);	
		
		
		
		
		}
	
	
	
}