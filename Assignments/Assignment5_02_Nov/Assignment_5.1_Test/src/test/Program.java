package test;

import org.sunbeam.dac.d3.lib.Address;
import org.sunbeam.dac.d3.lib.Date;
import org.sunbeam.dac.d3.lib.Person;

public class Program {

	public static void main(String[] args) {
		
   Date birthdate = new Date();
   Address address = new Address("maha", "nasik", 42200);
		Person person = new Person("suraj", birthdate, address);
	
		System.out.println(person.toString());
	
	}

}
