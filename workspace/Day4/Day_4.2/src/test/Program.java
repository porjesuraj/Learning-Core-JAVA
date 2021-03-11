package test;

import java.util.Date;

class Employee{
	
	private String name;
	private int empid;
	private String department;
	private String designation;
	private float salary;
	public Employee(String name, int empid, String department, String designation, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee()
	{
		this("",0,"","",0); 
	}
	
	public String getString( ) {
		String str = null;
		str = String.format("%-15s%-5d%-10s%-10s%-10.2f\n", this.name, this.empid, this.department, this.designation, this.salary);
		return str;
	}
	
	public void printRecord( ) {
		System.out.printf("%-15s%-5d%-10s%-10s%-10.2f\n", this.name, this.empid, this.department, this.designation, this.salary);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
	
	
}


public class Program {

	public static void main(String[] args) 
	{
		Employee emp = new Employee("suraj", 1, "IT", "developer", 1000.5f);
       
		 String str = emp.toString();
		
		 System.out.println(str);

	}
	
	
	public static void main4(String[] args) 
	{
		Date date = new Date();
		
		String str = date.toString();
		System.out.println(str);
		
	}
	
	
	
	public static void main3(String[] args) 
	{
		Integer num = new Integer(23);
		
		String str = num.toString(); 
		
		System.out.println(str);

	}
	
	
	
	public static void main2(String[] args) 
	{
		Employee emp = new Employee("suraj", 1, "IT", "developer", 1000.5f);
       
		 String str = emp.getString();
		
		 System.out.println(str);

	}
	
	
	
	public static void main1(String[] args) 
	{
		Employee emp = new Employee("suraj", 1, "IT", "developer", 1000.5f);
       
		emp.printRecord();
		

	}

}
