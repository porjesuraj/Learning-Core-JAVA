package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashSet;

public class Program {
	public static java.util.List<Integer> getIntegerList() {
		
		java.util.List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
		return list;
		
	}
	public static void main(String[] args) {
		
		java.util.List<Integer> list = Program.getIntegerList();
	
		//list.forEach(System.out::println);
		
		
		       Set<Integer> set = new LinkedHashSet<>(list); 
		       
		       list.clear();
		       list.addAll(set);
		       
		     for(Integer element : list)
		     {
		    	 System.out.println(element);
		     }
		       
}

	
}