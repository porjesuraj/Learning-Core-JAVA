package test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HealthProfileTest {
	
	public void acceptPatientInfo(HealthProfile hp)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		hp.setFirstName(sc.nextLine());
		System.out.println("Enter last name");
		hp.setLastName(sc.nextLine());
		
		System.out.println("Enter gender");
		hp.setGender(sc.nextLine());
		
		System.out.println("Enter birth day ");
		hp.setBirthDay(sc.nextInt());
		System.out.println("Enter birth month ");
		hp.setBirthMonth(sc.nextInt());
		System.out.println("Enter birth year ");
		hp.setBirthYear(sc.nextInt());
		
		System.out.println("Enter height in inches ");
		hp.setHeight(sc.nextDouble());
		
		System.out.println("Enter weight in pounds ");
		hp.setWeight(sc.nextDouble());
	}
	
	
	
	public int getPersonAge(HealthProfile hp)
	{
		int birthYear = hp.getBirthYear();
		
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int currentyear = calendar.get(Calendar.YEAR);
		
		
		//int currentyear = new Date();
		

		int age = currentyear - birthYear;
		
		return age;
	}
	
	public int getMaxHeartRate(HealthProfile hp)
	{
		int age = this.getPersonAge(hp);
		
		int maxHeartRate = 220 - age;
		
		return maxHeartRate;
	}
	public double getPersonTargetHeartRate(HealthProfile hp)
	{
		int maxRate = getMaxHeartRate(hp);
		
		double targetRate = 0.85 * maxRate;
		
		return targetRate; 
		
	}

}
