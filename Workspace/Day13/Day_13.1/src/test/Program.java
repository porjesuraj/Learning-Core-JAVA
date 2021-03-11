package test;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Program {

	private static Dictionary<Integer, String> getDictonary() {
		
		Dictionary<Integer, String> d = new Hashtable<>();
		
		d.put(1, "DAC");
		d.put(2, "DMC");
		d.put(3, "KDAC");
		
		return d; 
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Dictionary<Integer, String> d = Program.getDictonary();
	
	
		Program.printKeys(d);
		
		Program.printValues(d);
		
		Program.print(d); 
		
		Program.find(d,3); 
		
		Program.remove(d,3); 
		Program.print(d); 
	}
	private static void remove(Dictionary<Integer, String> d, int id) {
		
		if(d != null)
		{
			    Integer key  = new Integer(id);
			    
			    String value = d.remove(key);
			    if( value != null )
					System.out.println(key+" : "+value+" is removed.");
				else
					System.out.println(key+" not found.");
		}
		
	}
	private static void find(Dictionary<Integer, String> d, int id) {
		
		if(d != null)
		{
			  String value = d.get(id); 
			  
			  if(value != null)
			  {
				  System.out.println(id +  " : " + value);
			  } else
			  {
				  System.out.println(id + "not found");
			  }
			  
		}
		
	   
		
		
	}
	private static void print(Dictionary<Integer, String> d) {
		
		if(d != null)
		{
			Enumeration<Integer> keys = d.keys(); 
			while(keys.hasMoreElements())
			{
				Integer key = keys.nextElement();
				
				String value = d.get(key);
				
				System.out.println("key : " + key + " value : " + value);
			}
		}
		
	}
	private static void printValues(Dictionary<Integer, String> d) {
		
		if(d != null)
		{
		  Enumeration<String> values = d.elements(); 
		  
		  while(values.hasMoreElements())
		  {
			  System.out.println(values.nextElement());
		  }
		  
		}
		
	}
	private static void printKeys(Dictionary<Integer, String> d) {
		
		if(d != null)
		{
	 	     Enumeration<Integer> keys = d.keys() ; 
	 	     
	 	     while(keys.hasMoreElements())
	 	     {
	 	    	 Integer key = keys.nextElement();
	 	    	 
	 	    	 System.out.println(key);
	 	     }
		}
		
		
		
	}


}
