package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class Program {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(1, "Dac");
		map.put(2, "KDAC");
		map.put(3, "DMC");
		
	   Set<Entry<Integer, String>> entries = 	map.entrySet();
	   
	   for(Entry<Integer, String> entry : entries)
	   {
		   
		   System.out.println(entry.getKey() + " : " + entry.getValue());
	   }
	}
}