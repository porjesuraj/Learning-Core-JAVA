package org.sunbeam.dac.d3.employees.lib;

public class basePlusCommisionEmployee extends Employee {

	
	private double grossSales;
	private double commisionRate;
	private double salary;
	public basePlusCommisionEmployee() {
		
		this("","",0,0,0,0);
	}
	public basePlusCommisionEmployee(String firstName, String lastName, int sSN,double gSales,double cRate,double bSalary) {
		super(firstName, lastName, sSN);
		
		this.grossSales = gSales;
		this.commisionRate = cRate;
		this.salary = bSalary;
		
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + " " +   "basePlusCommisionEmployee [grossSales=" + grossSales + ", commisionRate=" + commisionRate + ", salary="
				+ salary + "]";
	}
	@Override
	public void earnings() {
		
		double commision = this.getCommisionRate() * this.getGrossSales();
		
		double earning = commision + this.getSalary();
		
		System.out.println("earning of base plus comm emp : " + earning);
		
	}
	
	
	
}
