package org.sunbeam.dac;



public class Circle extends Shape{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		
		this.area = Math.PI * Math.pow(this.radius, 2);
	}
}
	
	