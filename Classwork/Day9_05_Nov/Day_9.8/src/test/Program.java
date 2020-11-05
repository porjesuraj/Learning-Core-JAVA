package test;

class Employee{
	
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	

}


public class Program {

	public static void main(String[] args) {

		Employee emp1 = new Employee("suraj", 1, 100);
		
		Employee emp2 = new Employee("suraj", 1, 100);
		
		if(emp1 == emp2)//OK : Compares state of references 
			System.out.println("Equal");
		else
		System.out.println("not equal");

		//output : not equal
		
	}
	

}
