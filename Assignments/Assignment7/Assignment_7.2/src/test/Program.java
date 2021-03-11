package test;

import java.util.Arrays;

public class Program {

	public static Date[] getDates()
	{
		Date[] arr = new Date[5];
		
		arr[0] = new Date(1,2,2000); 
		arr[1] = new Date(2,2,2020); 
		arr[2] = new Date(1,2,2000); 
		arr[3] = new Date(4,4,2010); 
		arr[4] = new Date(5,5,2014); 
		
		return arr;
	}
	
	public static void printDates(Date[] arr)
	{
		 for( Date date : arr)
		 {
			 System.out.println(date.toString());
		 }
	}
	
public static void main(String[] args) {
		
		
		Date[] arr  = Program.getDates();
		
		System.out.println("before sort");
		Program.printDates(arr);
		
		Arrays.sort(arr);
		System.out.println("\n  after sort \n");
		Program.printDates(arr);
		

	}
	public static void main1(String[] args) {
		
		
		Date[] arr  = Program.getDates();
		
		
	   // check instance are equal 
		if(arr[0].equals(arr[2]))
		System.out.println("equals");
		else
			System.out.println("not equal");
		

	}

}
