package test;

public abstract class Shape {
	
	protected double area;
	protected double perimeter;
	
	public double getArea()
	{
		return this.area;
	}
	public double getPerimeter()
	{
		return this.perimeter;
	}
	

	@Override
	public String toString() {
		return "area = " + area + ", perimeter = " + perimeter + "";
	}
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
