package test;
import java.lang.reflect.Field;

class Person{
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Employee extends Person
{
	private int empid;
	private float salary;
	public Employee() {
	}
	
	public Employee(String name, int age, int empid, float salary) {
		super(name,age);
		this.empid = empid;
		this.salary = salary;
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
	public void printRecord( ) throws Exception{
		Class<?> c = this.getClass().getSuperclass();
		
		Field field = c.getDeclaredField("name");
		field.setAccessible(true);
		System.out.println("Name	:	"+field.get(this));
		
		field = c.getDeclaredField("age");
		field.setAccessible(true);
		System.out.println("Age	:	"+field.getInt(this));
		
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) throws Exception{
		Employee emp = new Employee("Sandeep",36,33,45000.0f);
		emp.printRecord();
		
		
	}		
	
}