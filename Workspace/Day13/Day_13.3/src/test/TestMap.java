package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	private Map<Account, Customer> map;
	
   public void setMap(Map<Account, Customer> map)
   {
	   this.map = map; 
   }
   
   public void add(Account[] keys,Customer[] values)
   {
	   if(this.map != null)
	   {
		   if(keys != null && values != null)
		   {
			   for (int i = 0; i < keys.length; i++) {
				
				   this.map.put(keys[i], values[i]);
				   
			}
			   
		   }
	   }
	   
   }
   
   public Customer find (int accountNumber)
   {
	   if(this.map != null)
	   {
		   Account key = new Account();
		   
		   key.setNumber(accountNumber);
		   
		   if(this.map.containsKey(key))
		    return this.map.get(key);
		   
	   }
	   return null; 
   }
  
   public boolean remove(int accountNumber) {
	   if(this.map != null)
	   {
		   Account key = new Account();
		   
		   key.setNumber(accountNumber);
		   
		   if(this.map.containsKey(key))
		    this.map.remove(key);
		   return true;
		   
	   }
	   return false; 
	   
   }
   
   
   public void print() {
	   
	   if(this.map != null)
	   {
  Set<Entry<Account, Customer>> entries = this.map.entrySet();
	   
          
  for(Entry<Account, Customer> entry : entries)
  {
	  
	  System.out.println(entry.getKey() + " " + entry.getValue());
  }
    
	   }
   }
 
}
