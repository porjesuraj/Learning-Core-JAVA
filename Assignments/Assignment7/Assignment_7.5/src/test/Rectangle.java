package test;

public class Rectangle extends Shape{

	private double length;
	private double breadth;
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
		return "Rectangle, length=" + length + ", breadth = " + breadth + " " + super.toString();
	}
	@Override
	public void calculateArea() {
		
		this.area =  this.length * this.breadth;
	}
	@Override
	public void calculatePerimeter() {
		
		this.perimeter =  ((2 * this.length) + (2 * this.breadth));
	}
	
}
