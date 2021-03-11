package test;



class Date {
	
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
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
	
	
	
}


public class Person implements Comparable<Person>{

  private String name;
  private Date birthDate;

  
  
  
public Person(String name, Date birthDate) {
	super();
	this.name = name;
	this.birthDate = birthDate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}
@Override
public String toString() {
	return "Person [name=" + name + ", birthDate=" + birthDate + "]";
}
	
	@Override
		public boolean equals(Object obj) {
		
		Person p1 = null;
		if(obj instanceof Person)
		{
			p1 = (Person) obj;
		}
		
		if(this.getBirthDate() == p1.getBirthDate())
		{
			return true;
		}
		
			return false;
		}
	@Override
	public int compareTo(Person o) {
		
		return this.birthDate.getYear() - o.birthDate.getYear() ;
	}
	
}
