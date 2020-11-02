package org.sunbeam.dac.d3.employees.lib;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	public HourlyEmployee() {
		this("","",0,0,0);
	}
	public HourlyEmployee(String firstName, String lastName, int sSN,double wages,double hour) {
		super(firstName, lastName, sSN);
		
		this.wage = wages;
		this.hours = hour;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + " " + "HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
	}
	@Override
	public void earnings() {
		double earning = 0;
		if(this.getHours() <= 40 )
		{
			earning = this.getWage() * this.getHours();
			
			
			
		} else if(this.getHours() > 40)
		{
			double overtimeEarning  =  (this.getHours() - 40) * this.getWage() * 1.5;
			
			earning = (40 * this.getHours()) + overtimeEarning;
			
		}
		
		System.out.println("earning of houred empoyee = " + earning);
		
	}
	
	
	
	
	
	
}
