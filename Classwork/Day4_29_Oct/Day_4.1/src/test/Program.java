package test;

import java.util.Calendar;

class Date{
	private int date;

	public Date() {
		super();
		this.date = Calendar.DATE;
	} 
	
	
	
}
class Employee{
	int empid;
	private Date birthDate;
	
	public Employee()
	{
		this.birthDate = new Date();
	}
}
public class Program {

	public static void main(String[] args) 
	{
		Date birthDate = new Date(); //inbuild  method 
		
		Employee emp = new Employee();
		
		System.out.println(birthDate);
		

	}

}
