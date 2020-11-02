package test;

import java.util.Scanner;

import org.sunbeam.dac.d3.employees.lib.CommisionEmployee;
import org.sunbeam.dac.d3.employees.lib.Employee;
import org.sunbeam.dac.d3.employees.lib.HourlyEmployee;
import org.sunbeam.dac.d3.employees.lib.SalariedEmployee;
import org.sunbeam.dac.d3.employees.lib.basePlusCommisionEmployee;

public class Program {

	
	
	
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int ischoice = 0; 
		
		do {
			System.out.println("please enter choice, to calculate employee earning ");
	         System.out.println("1. Salaried Employee \n 2. Hour based EMployee \n 3. Commision Employee ");
	         System.out.println("4. base plus Commision employees \n");
			
	         int choice = sc.nextInt();
	         
	         Employee emp = ObjectFactory(choice);
	         
	         
	         emp.earnings();
	         
	         
	         System.out.println("do you want to continue ? if yes press 1");
	         ischoice = sc.nextInt();
			
		} while (ischoice == 1);
		    
	}
	
	
	
	
	
	public static Employee ObjectFactory(int choice)
	{
		if(choice == 1)
		{
			return new SalariedEmployee("suraj", "porje", 1, 1000);
		}else if(choice == 2)
		{
			return new HourlyEmployee("suraj", "p", 2, 30, 10);
		} else if(choice == 3)
		{
			return new CommisionEmployee("raj", "di", 3, 5000, 200);
		}else if( choice == 4)
		{
			return new basePlusCommisionEmployee("mohit", "Tan", 4, 2000, 100, 3000);
			
		} else
		{
			return null;
		}
		
	}

}
