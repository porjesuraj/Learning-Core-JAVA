package test;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void print( Integer number ) {
		System.out.println(number);
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		//list.forEach(Number->System.out.println(Number));
	   //	list.forEach(Program::print);		
	 list.forEach(System.out::println);
	}
}
