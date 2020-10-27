package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;;
		do
		{
	
			
			
		System.out.println("please enter current world population ");
		double currentPopulation = sc.nextDouble();
		
		System.out.println("please enter  annul world population growth rate");
		double growthRate = sc.nextDouble();
		
		double populationGrowth = currentPopulation * (growthRate / 100);
		
		for (int i = 1; i < 6; i++) {
			
			double futurePopulation =  populationGrowth * i + currentPopulation;
			
			System.out.println("population after " + i + " year  is equal to :" + futurePopulation);
			
		}
		
		
		
		
		
		System.out.println("do you want to continue? enter true if yes");
         
		ischoice = sc.nextBoolean();
	
			
		} while (ischoice);
		
	
	
	    }
	
	
		
}	




/*
 * 8. Input the current world population and the annual world population
growth rate. Write an application to display the estimated world
population after one, two, three, four and five years.
 */
