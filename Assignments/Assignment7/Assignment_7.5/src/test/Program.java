package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


class SortByArea implements Comparator<Shape>
{
	@Override
	public int compare(Shape s1, Shape s2) {
		
		if(s1 instanceof Circle && s2 instanceof Circle)
		{
			Circle c1 = (Circle) s1;
			Circle c2 = (Circle) s2; 
			
			return (int) (c1.getArea() - c2.getArea());
			
		}else if (s1 instanceof Rectangle && s2 instanceof Rectangle)
		{
			Rectangle r1 = (Rectangle) s1;
			Rectangle r2 = (Rectangle) s2; 
			
			return (int) (r1.getArea() - r2.getArea());
		}else if(s1 instanceof Circle && s2 instanceof Rectangle)
		{
			Circle c1 = (Circle) s1;
			Rectangle r2 = (Rectangle) s2; 
			return (int) (c1.getArea() - r2.getArea()); 
		}else
		{
			Rectangle r1 = (Rectangle) s1;
			Circle c2 = (Circle) s2; 
			
			return (int) (r1.getArea() - c2.getArea()); 
		}
		
	}
	
}

class SortByPerimeter implements Comparator<Shape>
{
	@Override
	public int compare(Shape s1, Shape s2) {
		
		if(s1 instanceof Circle && s2 instanceof Circle)
		{
			Circle c1 = (Circle) s1;
			Circle c2 = (Circle) s2; 
			
			return (int) (c1.getPerimeter() - c2.getPerimeter());
			
		}else if (s1 instanceof Rectangle && s2 instanceof Rectangle)
		{
			Rectangle r1 = (Rectangle) s1;
			Rectangle r2 = (Rectangle) s2; 
			
			return (int) (r1.getPerimeter()- r2.getPerimeter());
		}else if(s1 instanceof Circle && s2 instanceof Rectangle)
		{
			Circle c1 = (Circle) s1;
			Rectangle r2 = (Rectangle) s2; 
			return (int) (c1.getPerimeter() - r2.getPerimeter()); 
		}else
		{
			Rectangle r1 = (Rectangle) s1;
			Circle c2 = (Circle) s2; 
			
			return (int) (r1.getPerimeter() - c2.getPerimeter()); 
		}
		
	}
	
}

public class Program {

	public static Shape[] getShapes()
	{
		Shape[] arr = new Shape[5];
		
		arr[0] = new Circle(10); 
		arr[1] = new Rectangle(10, 20);
		arr[2] = new Circle(30); 
		arr[3] = new Rectangle(20, 30);
		arr[4] =new Circle(20); 
		return arr;
	}
	
	public static void printShapes(Shape[] arr)
	{
		 for( Shape s : arr)
		 {
			 System.out.println(s.toString() + "\n");
			
		 }
	}
	
	
	public static void getArea(Shape[] arr)
	{
		
		for(Shape s : arr)
		{
			if(s instanceof Circle)
			{
				Circle c = (Circle) s; 
				c.calculateArea();
				
			}else
			{
				Rectangle r = (Rectangle) s;
				r.calculateArea();
			}
			
		}
		
		
	}
	
	public static void getPerimeter(Shape[] arr)
	{
		
		for(Shape s : arr)
		{if(s instanceof Circle)
		{
			Circle c = (Circle) s; 
			c.calculatePerimeter();
			
		}else
		{
			Rectangle r = (Rectangle) s;
			r.calculatePerimeter();
		}
		
			
		}
		
		
	}
	
public static void main(String[] args) {
		
		
		Shape[] arr  = Program.getShapes();
		Program.getArea(arr);
		Program.getPerimeter(arr);
		System.out.println("before sort \n ");
		Program.printShapes(arr);
		
		System.out.println(" \n compare by area \n ");
		 
		
		
		Arrays.sort(arr,new SortByArea());
		Program.printShapes(arr);
		
		System.out.println(" \n compare by  perimeter \n ");
		 
		Arrays.sort(arr,new SortByPerimeter());
		
		Program.printShapes(arr);
		

	}
	public static void main1(String[] args) {
		
		
		Shape[] arr  = Program.getShapes();
		
		
	   // check instance are equal 
		if(arr[0].equals(arr[2]))
		System.out.println("equals");
		else
			System.out.println("not equal");
		

	}

}
