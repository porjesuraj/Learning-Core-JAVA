package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Scanner;

class Point{
	
	private int xPos;
	private int yPos;
	
	public Point() {
	this.xPos = 10;
	this.yPos = 20;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
	
	
}


public class Program {

	public static void main(String[] args) {
		try {
			Point pt1 = new Point();
			
			System.out.println(pt1.toString());
			
			Field field = null;
			
		Class<?> c = pt1.getClass();
			
		field = c.getDeclaredField("xPos");
		
		field.setAccessible(true);

		field.setInt(pt1, 50);

		field = c.getDeclaredField("yPos");
		field.setAccessible(true);
		
		field.setInt(pt1, 50);
		
		System.out.println(pt1.toString());
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}