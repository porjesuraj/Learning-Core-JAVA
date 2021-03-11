package test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	

	static Scanner sc = new Scanner(System.in);
	
	private static void acceptArray(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print("arr[ "+row+" ][ "+col+" ]	:	");
					arr[ row ][ col ] = sc.nextInt();
				}
			}
		}
	}
	private static void printArray(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print(arr[ row ][ col ]+"	");
				}
				System.out.println();
			}
		}
	}
	
public static void main(String[] args) {
		
		int [][] arr = new int[4][];
		
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {4,5};
		arr[2] = new int[] {6,7,8,9};
		arr[3] = new int[] {10};
		
		
		
}	
	
public static void main5(String[] args) {
		
		int [][] arr = new int[4][];
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		arr[3] = new int[5];
		
		
		
}
	
	
public static void main4(String[] args) {
		
		int [][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for (int row = 0; row < arr.length; row++) {
				
			System.err.println(Arrays.toString(arr[row]));
		}
			
		}
	
	public static void main3(String[] args) {
		
		int [][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		//int [][] arr = new int[4][3];
		
		Program.acceptArray(arr);
		
		Program.printArray(arr);
			
		}
	
public static void main2(String[] args) {
		
	int [][] arr = new int[4][3];
	
	Program.acceptArray(arr);
	
	Program.printArray(arr);
		
	}

	public static void main1(String[] args) {
		
		int arr[] []; //OK
		int[] arr1[]; //ok
		int [] [] arr3; //ok

		//new int [4][3]; //ok
		
		int[][] arr4 = null; //ok
		
		arr4 = new int[4][3];//ok
	}

}
