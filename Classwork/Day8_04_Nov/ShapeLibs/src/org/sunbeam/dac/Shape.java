package org.sunbeam.dac;

public  abstract class Shape{
	
	protected double area;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public abstract void calculateArea();
}