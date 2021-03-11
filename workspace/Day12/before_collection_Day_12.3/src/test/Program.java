package test;

import java.util.Iterator;
import java.util.Scanner;

interface Collection{
	
	void acceptRecord();
	void printRecord();
	
	int[] toArray();
	
	static void swap( int[] arr ) {	//helper/utility method
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	default void sort( ) {
		int[] arr =  this.toArray();
		for( int i = 0; i < arr.length - 1; ++ i ) {
			for( int j = 0; j < arr.length - 1 - i; ++ j ) {
				if( arr[ j ] > arr[ j + 1 ] ) {
					int[] temp = { arr[ j ], arr[ j + 1 ] };
					Collection.swap(temp);
					arr[ j ] = temp[ 0 ]; arr[ j + 1 ] = temp[ 1 ];
				}
			}
		}
	}
	
	
}
	

class Array implements Collection{
	private int[] arr;
	
	public Array() {
		this(5);
	}
public Array(int length) {
		
	this.arr = new int[length];
	}
@Override
public void acceptRecord() {
	try( Scanner sc = new Scanner(System.in)){
		for( int index = 0; index < this.arr.length; ++ index ) {
			System.out.print("Enter element	:	");
			this.arr[ index ] = sc.nextInt();
		}
	}
	
}
@Override
public void printRecord() {
	for( int index = 0; index < this.arr.length; ++ index ) 
		System.out.print(this.arr[ index ]+" ");
	System.out.println();
	
}
@Override
public int[] toArray() {
	//return Arrays.copyOf(this.arr, this.arr.length); //Defensive Copy
			return this.arr;
}

@Override
public void sort() {
	//Collection.super.sort();	//Calling default method inside sub class
	for( int i = 0; i < arr.length - 1; ++ i ) {
		for( int j = i + 1; j < arr.length; ++ j ) {
			if( arr[ i ] > arr[ j ] ) {
				int[] temp = { arr[ i ], arr[ j ] };
				Collection.swap(temp);
				arr[ i ] = temp[ 0 ]; arr[ j ] = temp[ 1 ];
			}
		}
	}		
}

}


public class Program {

	public static void main(String[] args) {
		
		
	Collection c = new Array(5);
	
	c.acceptRecord();
	
	c.printRecord();
	c.sort();
	c.printRecord();
		
		
	}

}
