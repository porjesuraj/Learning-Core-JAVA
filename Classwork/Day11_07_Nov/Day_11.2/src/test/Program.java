package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Integer number = new Integer(1);
		
	  Class<?> c = number.getClass();
		
	 // Program.printTypeInfo(c);
	  
	//  Program.printFieldInfo(c);
		
	 // Program.printConstructorInfo(c);
	  
	  Program.printMethodInfo(c);
		
	}

	private static void printMethodInfo(Class<?> c) {
		
		if(c != null)
		{
			Method[] methods = c.getMethods();
			
			for(Method method : methods)
			{
				System.out.print(method.getReturnType() + " ");
				System.out.print(method.getName());
				
				System.out.println();
			}
		}
		
	}

	private static void printConstructorInfo(Class<?> c) {
	
		if(c != null)
		{
			Constructor<?>[] cons = c.getConstructors(); 
		
			for(Constructor<?> con : cons)
			{
				System.out.println(con.toString());
			}
		
		
		}
	
	}

	private static void printFieldInfo(Class<?> c) {
		
		if(c != null)
		{
		Field[] fields = 	c.getFields();
		
		for(Field field :  fields)
		{
			System.out.println(field.getName());
		}
		}
		
	}

	private static void printTypeInfo(Class<?> c) {
		
		if(c != null)
		{
			String packageName = c.getPackage().getName();
			
			System.out.println("Package name : " + packageName);
			      
			   String className  =  c.getSimpleName();
			   
			   System.out.println("class : " + className);
			   
			  String modifier =   Modifier.toString(c.getModifiers());
			 
			  System.out.println("class modifier : " + modifier);
			
			  
			  
		}
		
		
		
	}
}