package org.sunbeam.dac.d3.employees.lib;

public class CommisionEmployee extends Employee {

	private double grossSales;
	private double commisionRate;
	public CommisionEmployee() {
		this("","",0,0,0);
	}
	
	
	public CommisionEmployee(String firstName, String lastName, int sSN,double gsales,double cRate) {
		super(firstName, lastName, sSN);
		this.grossSales = gsales;
		this.commisionRate = cRate;
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


	@Override
	public String toString() {
		return super.toString() +  "CommisionEmployee [grossSales=" + grossSales + ", commisionRate=" + commisionRate ;
	}


	@Override
	public void earnings() {
	
		double earning = this.getCommisionRate() * this.getGrossSales();
		
		System.out.println("earning of commisioned employee = " + earning);
	}
	
	
	
	
	
	
	
}
