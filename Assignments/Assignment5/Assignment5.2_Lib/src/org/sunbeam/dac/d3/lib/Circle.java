package org.sunbeam.dac.d3.lib;

public class Circle {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle() {
		this.radius = 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
		
	public void Area(Circle c)
	{
		double area = Math.PI * Math.pow(c.getRadius(), 2);
		
		System.out.println("Area of rectangle : " + area);
	}
	public void Perimeter(Circle c)
	{
		double perimeter =  2 * Math.PI * c.getRadius();
		
		System.out.println("Perimeter of circle: " + perimeter);
	}
	
	
	
	
	
}
