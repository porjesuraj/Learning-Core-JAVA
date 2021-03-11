package test;

import java.util.Scanner;

abstract class Shape{
	
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

class Rectangle extends Shape{
	
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


class Circle extends Shape{
	
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
class ShapeFactory {
	public static Shape getInstance(int choice) {
		Shape shape = null;
		switch (choice) {
		case 1:
			shape = new Rectangle(); // Upcasting
			break;
		case 2:
			shape = new Circle(); // Upcasting
			break;
		}
		return shape;
	}
}

class ShapeTest
{
	private Shape shape = null; 
	
	public void setShape(Shape shape)
	{
		this.shape = shape; 
	}
	
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord()
	{
		if(this.shape != null)
		{
			if(shape instanceof Rectangle)
			{
				Rectangle rect =  (Rectangle) shape; 
				System.out.println("length");
				rect.setLength(sc.nextDouble());
				
				System.out.println("breadth");
				rect.setBreadth(sc.nextDouble());
				
				
			} else {
				
				Circle c = (Circle) shape;
				
				System.out.println("radius : ");
				c.setRadius(sc.nextDouble());
				
				
			}
			this.shape.calculateArea();
			
		}
		
		
	}
	
public void printRecord() {
		
	if(this.shape != null)
	{
		String className = shape.getClass().getSimpleName();
		
		System.out.println("Area of instance of class  "  + className +  " is  "  + shape.getArea());
	}
	
	
		
		
	}
	
public static int  menuList()
{
	System.out.println("0. Exit \n 1. Rectangle 2. Circle ");
     int choice = sc.nextInt(); 	
	
	return choice;
}


	
	
	
}


public class Program{
	static Scanner  sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		int choice ; 
		ShapeTest test = new ShapeTest();
		
		while((choice = ShapeTest.menuList()) != 0)
		{
			
			
			test.setShape(ShapeFactory.getInstance(choice));
			
			test.acceptRecord();
			
			test.printRecord();
			
			
			
			
			
			
		}
		
		
	}
}







