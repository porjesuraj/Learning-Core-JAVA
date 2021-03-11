package test;

import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class Program {

	static Scanner sc = new Scanner(System.in);
	
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Element");
		System.out.println("2.Find Element");
		System.out.println("3.Remove Element");
		System.out.println("4.Print Elements(Sorted)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void acceptRecord( int[] empid ) {
		System.out.print("Enter account number	:	");
		empid[ 0 ] = sc.nextInt();
	}
	public static Account[] getKeys( ) {
		Account[] arr = new Account[ 5 ];
		arr[ 0 ] = new Account(3012,"SAVING",350000);
		arr[ 1 ] = new Account(2416,"CURRENT",1200000);
		arr[ 2 ] = new Account(5971,"LOAN",2700000);
		arr[ 3 ] = new Account(1018,"PENTION",450000);
		arr[ 4 ] = new Account(4463,"JOINT",125000);
		return arr;
	}
	public static Customer[] getValues( ) {
		Customer[] arr = new Customer[ 5 ];
		arr[ 0 ] = new Customer("Amit","amit@gmail.com","1111");
		arr[ 1 ] = new Customer("Nilesh","nilesh@gmail.com","2222");
		arr[ 2 ] = new Customer("Nitin","nitin@gmail.com","3333");
		arr[ 3 ] = new Customer("Rahul","rahul@gmail.com","4444");
		arr[ 4 ] = new Customer("Sandeep","sandeep@gmail.com","5555");
		return arr;
	}
	public static void printRecord( Customer value ) {
		if( value != null )
			System.out.println( value.toString());
		else
			System.out.println("Account not found");
	}
	public static void printRecord( boolean removedStatus ) {
		if( removedStatus )
			System.out.println("Account is removed");
		else
			System.out.println("Account not found");
	}
	
	public static void main(String[] args) {
		
		int choice ; 
		
		int[] accountNumber = new int[1];
		
		TestMap test = new TestMap();
		
	//	test.setMap(new Hashtable<Account,Customer>());
		
		//test.setMap(new HashMap<Account,Customer>());
		
		test.setMap(new LinkedHashMap<Account,Customer>());
		
		
		while((choice = Program.menuList()) != 0)
		{
			
			switch (choice) {
			case 1:
				
				test.add(Program.getKeys(), Program.getValues());
				break;

			case 2: // find record
				Program.acceptRecord(accountNumber);
				
				Customer value = test.find(accountNumber[0]);
		
				Program.printRecord(value);
				break;
            case 3: // remove
            	
            	Program.acceptRecord(accountNumber);
                boolean removedStatus =  test.remove(accountNumber[0]);
            	
               Program.printRecord(removedStatus);
               
				
				break;
            case 4:
	
            	test.print();
	        break;
				
			default:
				break;
			}
		}
		
		
		
	}
}
















