package test;

public class Circle {
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void getDiameter(Circle c)
	{
		System.out.println("Diameter of circle = " + 2*c.getRadius());;
	}
	
	public void getCircumference(Circle c) {
		
		double circum = 2 * Math.PI * c.getRadius();
		
		System.out.println("Circumference of circle = " + circum);
	}
public void getArea(Circle c) {
	
	double area =  Math.PI * Math.pow(c.radius, 2);
	
	System.out.println("area of circle = " + area);
}
		
	}


