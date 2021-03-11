package test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

class Convert{
	
	public static Object changeType(String value,String type)
	{
		switch (type) {
		case "int":
			
			return Integer.parseInt(value);
			
        case "float":
			
        	return Float.parseFloat(value);
			
       case "double":
	      
    	   return Double.parseDouble(value);

		}
		return null;
		
	}
}



public class Program {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter F.Q.Type Name : ");
			
			String className = sc.nextLine(); // test.Calci
			
		 Class<?> c =	Class.forName(className);
		 
		 System.out.println("Method Name : ");
		 String methodName = sc.nextLine();
		 
		 Method[] methods = c.getMethods();
		 
		 for(Method method : methods)
		 {
			 if(method.getName().equals(methodName))
			 {
				 Parameter[] params = method.getParameters();
				 
				 Object[] arr = new Object[method.getParameterCount()];
				
				 for (int index = 0; index < method.getParameterCount(); index++) {
				
					 String type = params[index].getType().getName();
					 
					 System.out.println("Enter value for parameters of " + type + ":");
				 String value = sc.nextLine();
				 
				 arr[index] = Convert.changeType(value, type);
					 
					 
				}
				 
				 Object obj = c.newInstance();
				 
				 Object result = method.invoke(obj, arr);
				 System.out.println("Result : " + result);
				 
				 break;
			 }
		 }
			
			
			
		} catch (Exception e) {
			
		}
		
		
	}

}