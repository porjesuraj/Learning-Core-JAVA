package org.sunbeam.dac.d3.lib;

public class Rectangle {

	
	private double length;
	private double breadth; 
	
	public Rectangle() {
		this.length = 0.0f;
		this.breadth = 0.0f;
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
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	public void Area(Rectangle r)
	{
		double area = r.getLength() * r.getBreadth();
		
		System.out.println("Area of rectangle : " + area);
	}
	public void Perimeter(Rectangle r)
	{
		double perimeter = (2 * r.getLength() ) +  (2 * r.getBreadth());
		
		System.out.println("Perimeter of rectangle : " + perimeter);
	}
	
	
}




