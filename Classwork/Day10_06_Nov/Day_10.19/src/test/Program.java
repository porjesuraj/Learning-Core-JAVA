package test;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

class Employee {
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

class SortByName implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}	
	
}

class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpid() - o2.getEmpid();
	}
	
}

class SortBySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary() - o2.getSalary());
	}
	
}



public class Program { // Program.class	
	
	public static Employee[] getEMployees() {
		Employee[] arr = new Employee[5];
		
		arr[ 0 ] = new Employee("Prashant", 13, 50000);
		arr[ 1 ] = new Employee("Amol", 11, 40000);
		arr[ 2 ] = new Employee("Rupesh", 15, 30000);
		arr[ 3 ] = new Employee("Umesh", 14, 20000);
		arr[ 4 ] = new Employee("Mukesh", 12, 10000);
		
		return arr;
	}	
	public static void print(Employee[] arr,Comparator<Employee> comparator)
	{	
		if(arr != null)
		{
			Arrays.sort(arr, comparator);
			
			for(Employee emp : arr)
			{
				System.out.println(emp.toString());
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Employee[] arr = Program.getEMployees();
		
	System.out.println();
	
	System.out.println("comparator by name");
	Program.print(arr, new SortByName());
	System.out.println("comparator by id");
	Program.print(arr, new SortById());
	System.out.println("comparator by salary");
	Program.print(arr, new SortBySalary());
		
		
		
	}
	
	

	
}
