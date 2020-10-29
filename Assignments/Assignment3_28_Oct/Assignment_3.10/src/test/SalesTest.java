package test;

import java.util.Scanner;

public class SalesTest {
	
	public double getSalesPersonGrossSales()
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		double grossSales = 0.0;
		while(choice == 1)
		{
			
			System.out.println("do you want to enter Item sold amount");
			
			grossSales = sc.nextDouble();
			
			
			System.out.println("do you want to continue ,press 1 , or 0");
			choice = sc.nextInt();
		}
		
		return grossSales;
		
		
	}
	
	public void getSalesPersonEarning(SalesPerson sp)
	{
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		double grossSales = 0.0;
		while(choice == 1)
		{
			
			System.out.println("do you want to enter Item sold amount");
			
			grossSales = sc.nextDouble();
			
			
			System.out.println("do you want to continue ,press 1 , or 0");
			choice = sc.nextInt();
		}
		
		double salesCommision = 0.09 * grossSales + 200;
		sp.setEarning(salesCommision);
		
		System.out.println("Salesperson income is $" + salesCommision);
		
		
	}
	

}
