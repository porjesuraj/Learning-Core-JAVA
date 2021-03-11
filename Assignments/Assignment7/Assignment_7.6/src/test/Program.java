package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


class SortByIncome implements Comparator<Person>
{

	@Override
	public int compare(Person p1, Person p2) {
		
		if(p1 instanceof CricketPlayer && p2 instanceof CricketPlayer)
		{
			CricketPlayer c1 = (CricketPlayer) p1;
			
			CricketPlayer c2 = (CricketPlayer) p2; 
			
			return (int) (c1.getIncome() - c2.getIncome()); 
			
		}else if(p1 instanceof footballPlayer && p2 instanceof footballPlayer)
		{
			footballPlayer f1 = (footballPlayer) p1; 
			footballPlayer f2 = (footballPlayer) p2; 
			
			return (int) (f1.getIncome() - f2.getIncome());
			
		}else if(p1 instanceof CricketPlayer && p2 instanceof footballPlayer)
		{CricketPlayer c1 = (CricketPlayer) p1;
		footballPlayer f2 = (footballPlayer) p2; 
		
		return (int) (c1.getIncome() - f2.getIncome());
		} else {
			footballPlayer f1 = (footballPlayer) p1; 
			CricketPlayer c2 = (CricketPlayer) p2; 
			
		 return 	(int) (f1.getIncome() - c2.getIncome());
		}
		
	}
	
}




public class Program {

	public static Person[] getPersons()
	{
		Person[] arr = new Person[10];
		
		arr[0] = new CricketPlayer("sachin", 0, 15, 5); 
		arr[1] = new CricketPlayer("sehwag", 0, 10, 4); 
		arr[2] = new CricketPlayer("dravid", 0, 9, 2); 
		arr[3] = new CricketPlayer("dhoni", 0, 10, 7); 
		arr[4] = new CricketPlayer("virat", 0, 5, 2); 
		
		arr[5] = new footballPlayer("ronaldo", 0, 20, 10);
		arr[6] = new footballPlayer("messi", 0, 19, 8);
		arr[7] = new footballPlayer("mark", 0, 15, 4);
		arr[8] = new footballPlayer("austin", 0, 10, 2);
		arr[9] = new footballPlayer("rafael", 0, 5, 1);
		
		
		
		return arr;
	}
	
	public static void printPersons(Person[] arr)
	{
		 for( Person Person : arr)
		 {
			 System.out.println(Person.toString());
		 }
	}
	
	public static void getIncome (Person[] arr)
	{
		for(Person p : arr)
		{
			p.calculateIncome();
		}
	}
	
public static void main(String[] args) {
		
		
		Person[] arr  = Program.getPersons();
		
		System.out.println("before sort \n ");
		Program.printPersons(arr);
		
		Program.getIncome(arr);
		
		Arrays.sort(arr, new SortByIncome());
		
		System.out.println("\n  after sort \n");
		Program.printPersons(arr);
		

	}
	

}
