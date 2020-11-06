package test;

import java.sql.Array;
import java.util.Arrays;

class Employee implements Comparable<Employee>{
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
	//Employee this;
		//Employee other
	/*
	 * @Override public int compareTo(Employee other) { if(this.empid < other.empid)
	 * return -1; else if(this.empid > other.empid) return 1; else return 0;
	 * 
	 * 
	 * }
	 */
	
	/*
	 * @Override public int compareTo(Employee other) {
	 * 
	 * return this.empid - other.empid;
	 * 
	 * }
	 */
	
	/*
	 * @Override public int compareTo(Employee o) {
	 * 
	 * return this.name.compareTo(o.name); }
	 */
	
	@Override
	public int compareTo(Employee o) {
		return (int) (this.salary - o.salary);
		
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
	
	public static void print(Employee[] arr)
	{
		
		if(arr != null)
		{
			for(Employee emp : arr)
			{
				System.out.println(emp.toString());
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee[] arr = Program.getEMployees();
		Program.print(arr);
		
		Arrays.sort(arr);
		
		Program.print(arr);
	}
	
	
public static void main1(String[] args) {
		
	int[] arr = {5,4,3,6,2};
	
	Arrays.sort(arr);

	System.out.println(Arrays.toString(arr));
	
	}
	
}
