package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>( );
		
		ArrayList<Integer> list2 = new ArrayList<>( 15 );
		
		ArrayList<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		//System.out.println(list.size());
		
		ArrayList<Integer> list3 = new ArrayList<>( list );
		System.out.println(list3.size());
	}
	
	public static void main2(String[] args) {
		List<Integer> list1 = new ArrayList<>( );	//Upcasting
		
		List<Integer> list2 = new ArrayList<>( 15 );	//Upcasting
		
		LinkedList<Integer> list = new LinkedList<>( );
		list.add(10);
		list.add(20);
		List<Integer> list3 = new ArrayList<>( list );	//Upcasting
	}
	
	public static void main3(String[] args) {
		Collection<Integer> list1 = new ArrayList<>( );//Upcasting
		
		Collection<Integer> list2 = new ArrayList<>( 15 );//Upcasting
		
		Collection<Integer> c = new LinkedList<>( );//Upcasting
		c.add(10);
		c.add(20);
		Collection<Integer> list3 = new ArrayList<>( c );//Upcasting
	}
}
