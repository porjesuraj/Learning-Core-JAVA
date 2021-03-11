package org.sunbeam.dac.d3.employees.lib;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	
	public SalariedEmployee() {
		this("","",0,0); 
	}
	
	
	public SalariedEmployee(String firstName, String lastName, int sSN,double salary) {
		super(firstName, lastName, sSN);
		
		this.weeklySalary = salary;
		
		
	}



	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	

	@Override
	public String toString() {
		return super.toString() + " " + "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}


	@Override
	public void earnings() {
         
		System.out.println("earning = " + this.getWeeklySalary());
 
		
	}

	
}
