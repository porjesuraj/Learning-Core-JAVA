package test;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return  "Circle,radius = " + radius + " " + super.toString() ;
	}

	@Override
	public void calculateArea() {
		
		this.area =  Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		this.perimeter =  (2 * Math.PI * this.radius);
	}
	
	
	
	
}
