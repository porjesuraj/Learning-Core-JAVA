package org.sunbeam.dac.d3.lib;

public class Triangle {

	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
		
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	
	public void Area(Triangle t)
	{
		double a = t.getSide1();
		double b = t.getSide2();
		double c = t.getSide3();
		
		double s =  (a + b + c)/2;
		
		double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		
		System.out.println("Area of Triangle : " + Area );
	}
	public void Perimeter(Triangle t)
	{
		double perimeter =  t.getSide1() + t.getSide2() + t.getSide3();
		
		System.out.println("Perimeter of Triangle: " + perimeter);
	}
	
}
