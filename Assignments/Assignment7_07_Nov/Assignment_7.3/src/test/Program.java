package test;

import java.util.Arrays;

public class Program {

	public static Address[] getAddresss()
	{
		Address[] arr = new Address[5];
		
		arr[0] = new Address("west bengal","kolkata",422100); 
		arr[1] = new Address("goa","panji",422100); 
		arr[2] = new Address("maharashtra","pune",422100); 
		arr[3] = new Address("maharashtra","nasik",422100); 
		arr[4] =new Address("kerela","kochi",422100); 
		
		return arr;
	}
	
	public static void printAddresss(Address[] arr)
	{
		 for( Address Address : arr)
		 {
			 System.out.println(Address.toString());
		 }
	}
	
public static void main(String[] args) {
		
		
		Address[] arr  = Program.getAddresss();
		
		System.out.println("before sort");
		Program.printAddresss(arr);
		
		Arrays.sort(arr);
		System.out.println("\n  after sort \n");
		Program.printAddresss(arr);
		

	}
	public static void main1(String[] args) {
		
		
		Address[] arr  = Program.getAddresss();
		
		
	   // check instance are equal 
		if(arr[0].equals(arr[2]))
		System.out.println("equals");
		else
			System.out.println("not equal");
		

	}

}
