package test;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

class Person{
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
}

class Employee extends Person{
	
	private int empid;

	public Employee(String name, int empid) {
		super(name);
		this.empid = empid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return super.toString() +  "Employee [empid=" + empid + "]";
	}
	
	
	
}

class Student extends Person{
	
	
	private int rollNumber;

	public Student(String name, int rollNumber) {
		super(name);
		this.rollNumber = rollNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "Student [rollNumber=" + rollNumber + "]";
	}
	
	
	
}



class SortByName implements Comparator<Person>
{
	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.getName().compareTo(p2.getName());
	}
}

class SortById implements Comparator<Person>
{
	@Override
	public int compare(Person p1, Person p2) {
	
		if(p1 instanceof Employee && p2 instanceof Employee)
		{
			Employee emp1 = (Employee) p1;
			Employee emp2 = (Employee) p2; 
			
			return emp1.getEmpid() - emp2.getEmpid();
		} else if(p1 instanceof Student && p2 instanceof Student)
		{
			Student s1 = (Student) p1;
			Student s2 = (Student) p2; 
			
			return  s1.getRollNumber() - s2.getRollNumber();
		} else if(p1 instanceof Student && p2 instanceof Employee)
		{
			Student s1 = (Student) p1;
			Employee emp2 = (Employee) p2; 
			
			return s1.getRollNumber() - emp2.getEmpid();
		} else {
			
			Student s2 = (Student) p2;
			Employee emp1 = (Employee) p1; 
			
			return emp1.getEmpid() - s2.getRollNumber(); 
		}
		
		
		
	}
}




public class Program { // Program.class	
	
	public static Person[] getPerson() {
		Person[] arr = new Person[5];
		
		arr[ 0 ] = new Employee("Prashant", 13);
		arr[ 1 ] = new Student("Amol", 11);
		arr[ 2 ] = new Employee("Rupesh", 15);
		arr[ 3 ] = new Employee("Umesh", 14);
		arr[ 4 ] = new Student("Mukesh", 12);
		
		return arr;
	}	
	public static void print(Person[] arr)
	{	
		if(arr != null)
		{
			for(Person p : arr)
			{
				System.out.println(p.toString());
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Person[] arr = Program.getPerson();
		
		
	System.out.println();
	
	
	
	System.out.println("comparator by name");
	Arrays.sort(arr,new SortByName());
	
	Program.print(arr);
	System.out.println("comparator by id");
	
Arrays.sort(arr, new SortById());

 Program.print(arr);
		
		
		
	}
	
	

	
}
