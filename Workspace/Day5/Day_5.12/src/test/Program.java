package test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	private static void acceptArray(int[] arr) {
		if( arr != null ) {
			for( int index = 0; index < arr.length; ++ index ) {
				System.out.print("arr[ "+index+" ]	:	");
				arr[ index ] = sc.nextInt();
			}
		}
	}
	private static void printArray(int[] arr) {
		if( arr != null ) {
			for( int index = 0; index < arr.length; ++ index )
				System.out.println(arr[ index ] );
		}
	}
	
	 public static void main(String[] args) {
			
			int[] arr = new int[] {50,10,20,30,40};
			// for each n java
		System.out.println(arr.toString()); // output: [I@677327b6
			
		System.out.println(Arrays.toString(arr)); //[50, 10, 20, 30, 40]
			
		}
	
	 public static void main11(String[] args) {
			
			int[] arr = new int[] {50,10,20,30,40};
			// for each n java
			for(int element : arr)  // forward only and read only loop
				System.out.println(element);
			
			
			
		}
	
     public static void main10(String[] args) {
		
		int[] arr = new int[] {50,10,20,30,40};
		Program.printArray(arr);
	
		Arrays.sort(arr);
		Program.printArray(arr);
	}
	
	
	
	
	public static void main9(String[] args) {
		
		int[] arr = new int[] {10,20,30};
		int value1 = arr[1];
		//int  value2 = arr[-1]; //ArrayIndexOutOfBoundsException
		//int value3 = arr[10];
	}
	
	
	
	
	
	
	
	
	
	
	public static void main8(String[] args) {
		//int[] arr = new int[ 3 ] { 10, 20, 30 };	//Not OK // cannot provide dimension , with array initializer list
		int[] arr2 = new int[ ] { 10, 20, 30 };	//OK
		// int[] arr3 = new int[ ]; //Not Ok
		int[] arr3 = new int[ 1];	//OK
		
	}
	public static void main7(String[] args) {
		int[] arr = new int[ 3 ];
		Program.acceptArray(arr);
		Program.printArray(arr);
	}
 public static void main6(String[] args) {
		
		Object object = new int[3]; 
			
		
			//Program.printArray(object); //not ok
		
		int[] arr = (int[]) object;
		
		Program.printArray(arr);
	
		
		//double[] arr2 = (double[]) object; //Not ok //java.lang.ClassCastException
		
		
		Object[] arr3 = new String[3];
		arr3[0] = new String("Dac"); 
		arr3[1] = new Integer(1); //Arrayclass exception 
		
		
}
		
public static void main5(String[] args) {
		
	int[] arr1 = new int[3]; 
		
		Program.printArray(arr1);
	 	
int[] arr2 = new int[5]; 
		
	//	Program.printArray(arr2);
		
Program.printArray(null);
	}
	
	
	
	
public static void main4(String[] args) {
		
		
		
		int[] arr1 = new int[3]; 
		
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i]);
		}
		
	}
public static void main3(String[] args) {
		
		
		
		int[] arr1 = new int[-3]; // NOT OK // Negative array size exception
		
	}
	
public static void main2(String[] args) {
		
		int[] arr = null;
		arr = new int[3];
		
	//	int[] arr2 = new int[3];
		//int arr3[] = new int[3];
	}
	
	
	public static void main1(String[] args) {
		
		int arr[]; //OK
		int [] arr2 ; //OK
		//int [arr3]; // Not OK
		
	}
	
}
	

            