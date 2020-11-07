package test;

import java.util.Arrays;
import java.util.Date;

public class Program {

	public static Person[] getPersons()
	{
		Person[] arr = new Person[5];
		
		arr[0] = new Person("suraj", new test.Date(1, 1, 2020)); 
		arr[1] = new Person("suraj", new test.Date(1, 1, 2010)); 
		arr[2] = new Person("suraj", new test.Date(1, 1, 2014)); 
		arr[3] = new Person("suraj", new test.Date(1, 1, 2011)); 
		arr[4] =new Person("suraj", new test.Date(1, 1, 2000)); 
		return arr;
	}
	
	public static void printPersons(Person[] arr)
	{
		 for( Person Person : arr)
		 {
			 System.out.println(Person.toString());
		 }
	}
	
public static void main(String[] args) {
		
		
		Person[] arr  = Program.getPersons();
		
		System.out.println("before sort");
		Program.printPersons(arr);
		
		Arrays.sort(arr);
		System.out.println("\n  after sort \n");
		Program.printPersons(arr);
		

	}
	public static void main1(String[] args) {
		
		
		Person[] arr  = Program.getPersons();
		
		
	   // check instance are equal 
		if(arr[0].equals(arr[2]))
		System.out.println("equals");
		else
			System.out.println("not equal");
		

	}

}
