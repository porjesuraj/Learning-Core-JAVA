package test;

import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.addLast(10);

		list.addLast(20);

		list.addLast(30);
		list.addLast(40);
	
		for(Integer element : list)
		{
			System.out.println(element);
		}
	}

}
