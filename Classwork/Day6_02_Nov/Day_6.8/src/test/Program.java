package test;
import java.lang.reflect.Field;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
class Employee extends Person{
	private int empid;
	private float salary;
	
	public Employee(String name, int age, int empid, float salary){
		super( name, age );
		this.empid = empid;
		this.salary = salary;
	}
	
}
public class Program {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Employee emp = new Employee("Suraj", 26, 1, 1000.5f);
		
		/*
		 * Class<?> c = emp.getClass();
		 * 
		 * Field field = null;
		 * 
		 * field = c.getField("name");
		 * 
		 * System.out.println();
		 */
		
		
		
	}

}

            
