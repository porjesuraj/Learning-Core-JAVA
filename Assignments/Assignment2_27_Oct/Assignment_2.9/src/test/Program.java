package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;;
		do
		{
	
			
			
		System.out.println("please enter a 3 digit number ");
		int number = sc.nextInt();
		
		int[] input = {0,0,0} ; 
		int digit = 0;
		for (int i = 0; i < 3; i++) {
			
			digit = number % 10;
			
			input[i] = digit;
			
			number = number / 10;
			
		}
		
		 for (int x = 0; x < 3; x++)
		 {
			   for (int y = 0; y < 3; y++)
			   {
			    for (int z = 0; z < 3; z++)
			    {
			     if (x != y && y != z && z != x) 
			     {
			      System.out.println(input[x] + "" + input[y] + "" + input[z]);
			     }
			    }
			   }
			  }
		
		
		
		
		
		
		System.out.println("do you want to continue? enter true if yes");
         
		ischoice = sc.nextBoolean();
	
			
		} while (ischoice);
		
	
	
	    }
	
	
		
}	




/*
 * 9. Write a program to accept 3 digits and print all possible
combination of these three digits
(For example if three digits are 1, 2 and 3 then all possible
combinations are 123,132,231,213,321 and 312)
 */
