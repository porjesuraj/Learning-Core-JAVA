package test;


import java.util.Scanner;

public class ShapeTest
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