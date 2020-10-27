package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;;
		do
		{
			
			
		System.out.println("please enter  your weight in kilogram ");
		double weight = sc.nextDouble();
		System.out.println("please enter  your height in meter");
		double height = sc.nextDouble();
		
		double h2 = height * height;
		
		double bmi = weight/ h2;
		
	System.out.println("bmi = " + bmi);
		if(bmi < 18.5)
		{
			System.out.println("Under weight");
		} else if(bmi >= 18.5 && bmi <= 24.9)
		{
			System.out.println("Normal weight");
		} else if (bmi >= 25 && bmi <= 29.9)
		{
			System.out.println("Over weight");
		}
		else
		{
			System.out.println("Obese");
		}
			
		
		
		System.out.println("do you want to continue? enter true if yes");
         
		ischoice = sc.nextBoolean();
	
			
		} while (ischoice);
		
	
	
	    }
	
	
		
}	




/*
 * Create a BMI (Body Mass Index) calculator that reads the user’s
weight in pounds and height in inches (or, if you prefer,
the user’s weight in kilograms and height in meters), then
calculates and displays the user’s body mass index.
The formula for calculating BMI is
(WeightInKiloGrams)
BMI = ----------------------------
(HeightInMeters * HeightInMeters);
BMI VALUES
Underweight if BMI is less than 18.5
Normal if BMI is in between 18.5 and 24.9
Overweight if BMI is in between 25 and 29.9
Obese if BMI is 30 or greater
 */
