package test;

import java.util.Scanner;

public class Program {
	
	final static double rupee = 74.61;
	final static double dollar = 0.013;
	static Scanner sc = new Scanner(System.in);
	
	public static void getrupeeToDollar()
	{
		System.out.println("please enter rupee value ");
		
		double rupees = sc.nextDouble();
		
		double convertToDollar = rupees * dollar;
		
		
		System.out.println(" Rs. " + rupees + " = $  " + convertToDollar);
		
	}
	public static void getDollarToRupee()
	{
		System.out.println("please enter dollar value ");
		
		double dollars = sc.nextDouble();
		
		double convertToRupee = rupee * dollars;
		
		
		System.out.println("$ " + dollars + " = Rs.   " + convertToRupee);
		
	}
	
	
	
	 public static void main(String[] args) { 
	     
		
		 int choice = 0 ;
		 
		 int ischoice = 0;
		 
		 do {
			 System.out.println("for currency exchange  please  enter \n  1. rupee to dollar \n 2. dollar to rupee");
	         
			 choice = sc.nextInt();
			 
			 
			 switch (choice) {
				case 1:
					
					Program.getrupeeToDollar();
					break;
		          case 2:
					
		        	  Program.getDollarToRupee();
					break;

				default:
					System.out.println("wrong choice ");
					break;
				}
			 
			 System.out.println("do you want to continue ? press 1 to continue");
			 ischoice = sc.nextInt();
			
		} while (ischoice == 1 );
		 
		 
		 
		 
	    } 
	}


/*

Q.6 Write a class with a set of static methods to perform
foreign exchange
conversions.
For e.g., it could do conversion from INR to USID
(Indian Rupee to US Dollar).
*/