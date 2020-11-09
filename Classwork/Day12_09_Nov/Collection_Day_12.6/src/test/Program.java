package test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( int[] element ) {
		if( element != null ) {
			System.out.print("Enter element	:	");
			element[ 0 ] = sc.nextInt();
		}
	}
	public static void printRecord( Integer value ) {
		if( value != null)
			System.out.println("Element found at index "+value);
	}
	public static void printRecord( boolean removedStaus ) {
		if( removedStaus )
			System.out.println("Element is removed");
		else
			System.out.println("Element is not removed");
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Element");
		System.out.println("2.Find Element");
		System.out.println("3.Remove Element");
		System.out.println("4.Print Elements(Sorted)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] element = new int[ 1 ];	//To pass by reference
		ListTest test = new ListTest();
		test.setList(new ArrayList<Integer>());
		//test.setList(new Vector<Integer>()));
		//test.setList(new LinkedList<Integer>());
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Program.acceptRecord(element);
				test.add(element[ 0 ]);
				break;
			case 2:
				Program.acceptRecord(element);
				Integer value = test.find(element[ 0 ] );
				Program.printRecord(value);
				break;
			case 3:
				Program.acceptRecord(element);
				boolean removedStatus = test.remove(element[0]);
				Program.printRecord(removedStatus);
				break;
			case 4:
				test.print();
				break;
			}
		}
	}
}
