package test;

public class HealthProfile {
	private String firstName ; 
	private String lastName; 
	private String gender; 
	private int birthDay; 
	private int birthMonth; 
	private int birthYear; 
	private double height; //inches 
	private double weight; //in pounds 
	public HealthProfile(String firstName, String lastName, String gender, int birthDay, int birthMonth, int birthYear,
			double height, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;
	}
	public HealthProfile() {
		
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "HealthProfile [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", birthDay="
				+ birthDay + ", birthMonth=" + birthMonth + ", birthYear=" + birthYear + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
	

}



/*
In this exercise, you’ll design a HealthProfile class for a
person.
The class attributes should include the person’s first name,
last name, gender, date of birth (consisting of separate
attributes for the month, day and year of birth), height (in
inches) and weight (in pounds).
Your class should have a constructor that receives this data.
For each attribute, provide set and get methods.
The class also should include methods that calculate and return
the user’s age in years, maximum heart rate and target-heart-
rate range, and body mass index.
Write a Java application that prompts for the person’s
information, instantiates an object of class HealthProfile for
that person and prints the information from that object—
including the person’s first name, last name, gender, date of
birth, height and weight—then calculates and prints the person’s
age in years, BMI, maximum heart rate and target-heart-rate
range.
Note : Use previous assignment for calculating BMI and heart
rate*/