package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class Program {

	private static Map<Integer, String> getMap() {
		
		Map<Integer, String> d = new Hashtable<>();
		
		d.put(1, "DAC");
		d.put(2, "DMC");
		d.put(3, "KDAC");
		
		return d; 
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Map<Integer, String> d = Program.getMap();
	
	
		Program.printKeys(d);
		
		Program.printValues(d);
		
		Program.print(d); 
		
		Program.find(d,3); 
		
		Program.remove(d,3); 
		Program.print(d); 
	}
	private static void remove(Map<Integer, String> map, int id) {
		
		if(map != null)
		{
			    Integer key  = new Integer(id);
			    
			  
			    if(map.containsKey(id) )
					System.out.println(key +" : " + map.remove(id) +" is removed.");
				else
					System.out.println(key+" not found.");
		}
		
	}
	private static void find(Map<Integer, String> map, int id) {
		
		if(map != null)
		{
			  
			  
			  if(map.containsKey(id))
			  {
				  System.out.println(id +  " : " + map.get(id));
			  } else
			  {
				  System.out.println(id + "not found");
			  }
			  
		}
		
	   
		
		
	}
	private static void print(Map<Integer, String> map) {
		
		if(map != null)
		{
		     Set<Entry<Integer, String>> entrysets = map.entrySet(); 
			
				for( Entry<Integer, String> entry : entrysets)
				System.out.println("key : " + entry.getKey()+ " value : " + entry.getValue());
			
		}
		
	}
	private static void printValues(Map<Integer, String> map) {
		
		if(map != null)
		{
		      Collection<String> values = map.values(); 
		  
		 for(String value : values)
		 {
			 System.out.println(value);
		 }
		  
		}
		
	}
	private static void printKeys(Map<Integer, String> map) {
		
		if(map != null)
		{
	 	    Set<Integer> keys = map.keySet(); 
	 	     
	 	    for(Integer key : keys)
	 	    {
	 	    	System.out.println(key);
	 	    }
		}
		
		
		
	}


}
