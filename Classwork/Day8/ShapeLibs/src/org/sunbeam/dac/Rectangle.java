package org.sunbeam.dac;


public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
	
	
	
	
}
