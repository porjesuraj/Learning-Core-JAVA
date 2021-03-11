package test;

class Date implements Cloneable{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
		this(0,0,0);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	@Override
	protected Date clone() throws CloneNotSupportedException {
		Date other = (Date) super.clone();//Creating new instance from exisiting instance
		return other;
	}
	
}


class Employee implements Cloneable{
	private String name;
	private int empid;
	private float salary;
	private Date joindate;
	public Employee(String name, int empid, float salary, Date joindate) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.joindate = joindate;
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
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + ", joindate=" + joindate + "]";
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		
		Employee other = (Employee) super.clone();
		return other;
	}
	
	
}


public class Program { // Program.class
public static void main(String[] args) {
		
		Employee emp1 = new Employee("suraj", 1, 100, new Date());
		
		System.out.println(emp1.toString());
	
		Employee emp2;
		try {
			emp2 = emp1.clone(); // Shallow copy of instance
			System.out.println(emp2.toString());
		emp1.getJoindate().setDay(1);
		emp1.getJoindate().setMonth(1);
		emp1.getJoindate().setYear(2007);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
			
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}	
	}
	
	public static void main3(String[] args) {
		
		Employee emp1 = new Employee("suraj", 1, 100, new Date());
		
		System.out.println(emp1.toString());
	
		Employee emp2;
		try {
			emp2 = emp1.clone();
			System.out.println(emp2.toString());
			if(emp1 == emp2)
				System.out.println("equal");
			else
				System.out.println("not equal");
			
			// not equal , //Creating new instance from exisiting instance
			
			
			
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
public static void main2(String[] args) {
		
		Employee emp1 = new Employee("suraj", 1, 100, new Date());
		
		System.out.println(emp1.toString());
		
		
		 Employee emp2 = emp1;
			System.out.println(emp2.toString());
			if(emp1 == emp2)
				System.out.println("equal");
			else
				System.out.println("not equal");
			
			// equal 
		
		
		
		
		
		
		
		
	}
	public static void main1(String[] args) {
		
		Date dt1 = new Date(1, 1, 1994);
		
		System.out.println("date 1 : " + dt1.toString());
		Date dt2;
		try {
			dt2 = dt1.clone();
			System.out.println("date 2 : " + dt2.toString());	
		
			if( dt1 == dt2 )
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //shallow copy of references, get same reference 
		
		
	
	}
	
}
