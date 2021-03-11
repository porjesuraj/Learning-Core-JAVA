package assignment;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Program {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		Class<?> c = obj.getClass();
		
		 Method[] methods =  c.getDeclaredMethods();
		 System.out.println("public " + c.toString() + "   { \n");
		 for(Method method : methods)
		 {
			    Class[] parameters =  method.getParameterTypes();
			  Class<?>[] exceptions  =  method.getExceptionTypes();
			 
			int modifier =  method.getModifiers(); 
			
			Class Params = null;
			for(Class parameter : parameters)
			Params = parameter;
			
			
			String except = null;
			for(Class exception : exceptions)
			except = exception.getName();
			
			
			System.out.print(  Modifier.toString(modifier)  +  " " +  method.getReturnType() + " " + method.getName() );
			
			if(Params != null)
			System.out.print(" (" + Params +  ") " );
			else
			System.out.print(" ( " +   ") " );
			
			
			
			if(except != null)
			System.out.print(   " throws " + except );
			
			
			
	 
			   System.out.println();
		 }
		 
		 
		 System.out.println(" \n  }");
		
		
		

	}

}



/*javap java.lang.Object
Compiled from "Object.java"
public class java.lang.Object {
  public java.lang.Object();
  public final native java.lang.Class<?> getClass();
  public native int hashCode();
  public boolean equals(java.lang.Object);
  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public java.lang.String toString();
  public final native void notify();
  public final native void notifyAll();
  public final native void wait(long) throws java.lang.InterruptedException;
  public final void wait(long, int) throws java.lang.InterruptedException;
  public final void wait() throws java.lang.InterruptedException;
  protected void finalize() throws java.lang.Throwable;*/