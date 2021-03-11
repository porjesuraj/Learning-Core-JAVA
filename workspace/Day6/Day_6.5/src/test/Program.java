package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
class Person{
	private String name;
	private int age;
	
	public Person() {
		this.name = "";
		this.age = 0;
		System.out.println("Person cont");
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void printRecord()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Age : " + this.age);
	}
	
}

class Employee extends Person{
	// default mode of inheritence is public 
	//in java, except constructor,all member(static,not static,private) of superclass inherit in sub class
	
	private int empid;
	private float salary;
	
	public Employee() {
		this.empid = 0;
		this.salary = 0;
		System.out.println("Employeee cont");
	}
	// in c++ , conbstructor base initializing list
	public Employee(String name,int age,int empid,float salary) {
            
		super(name,age); 
		this.empid = empid;
		this.salary = salary;
		System.out.println("Employeee cont");
	}
	
	public void printRecord()
	{
		super.printRecord();
		// using super keyword we can access member of super class in method of sub class
		System.out.println("emp id: " + this.empid);
		System.out.println("Salary : " + this.salary);
		
	}
	
}


public class Program {
public static void main(String[] args) {
		
		Employee emp = new Employee("suraj",26,1,23);
		emp.printRecord();
		
			
		}
	public static void main2(String[] args) {
		
		Employee emp = new Employee();
		emp.printRecord();
		
			
		}
	
	public static void main1(String[] args) {
		
	Person p1 = new Person();
	p1.printRecord();
		
	
	Person p2 = new Person("suraj",1);
	p2.printRecord();
		
	
		
	}
	
}

            
