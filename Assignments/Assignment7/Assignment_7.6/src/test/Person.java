package test;




public abstract class Person {

  private String name;
 protected double income ;
public Person(String name, double income) {
	super();
	this.name = name;
	this.income = income;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getIncome() {
	return income;
}

public abstract void calculateIncome();
@Override
public String toString() {
	return "Person [name=" + name + ", income=" + income + "]";
} 


 

  
 
	
}
