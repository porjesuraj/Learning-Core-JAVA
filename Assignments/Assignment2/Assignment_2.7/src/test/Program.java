package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;;
		do
		{
	
			
			
		System.out.println("please enter total miles per day ");
		double milesPerDay = sc.nextDouble();
		
		System.out.println("please enter  cost per gallon of gasoline");
		double fuelCost = sc.nextDouble();
		
		System.out.println("please enter  average miles per gallon");
		double averageMiles = sc.nextDouble();
		
		System.out.println("please enter Parking fees per day");
		double parkingFees = sc.nextDouble();
		
		System.out.println("please enter  Tools per day cost");
		double toolCost = sc.nextDouble();
		
		double costPerDayForFuel = (milesPerDay * fuelCost)/averageMiles; 
		
		
		
		double totalCost = costPerDayForFuel + parkingFees + toolCost;
		
		
		System.out.println(" \n the user’s cost per day of driving to work = " + totalCost);
	
		
		
		System.out.println("do you want to continue? enter true if yes");
         
		ischoice = sc.nextBoolean();
	
			
		} while (ischoice);
		
	
	
	    }
	
	
		
}	




/*
 * 7. Create an application that calculates your daily driving cost, so
that you can estimate how much money could be saved by car pooling,
which also has other advantages such as reducing carbon emissions and
reducing traffic congestion. The application should input the
following information and display the user’s cost per day of driving
to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
 */
