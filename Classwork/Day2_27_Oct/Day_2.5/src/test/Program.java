package test;


public class Program {
	
	public static void main(String[] args)
	{
		String str =  "1a23";
		
		int number = Integer.parseInt(str);
		
		System.out.println("string :  " + str +  " to number " + number);
		// gives error , due to string format incorrect 
	}
	
	public static void main4(String[] args)
	{
		String str =  "123";
		
		int number = Integer.parseInt(str);
		
		System.out.println("string :  " + str +  " to number " + number);
		
	}
	public static void main3(String[] args)
	{
		// primitive type are itself not classes, so need wrapper class
		
		double number = 10.5;
		
		String strNumber2 = Double.toString(number);
		
		String strNumber = String.valueOf(number); //boxing
		
		System.out.println("number : " + number + " to string : " + strNumber);
		System.out.println("number : " + number + " to string : " + strNumber2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main2(String[] args)
	{
		// primitive type are itself not classes, so need wrapper class
		
		int number = 10;
		
		//String strNumber = Integer.toString(number);
		
		String strNumber = String.valueOf(number); //boxing
		
		System.out.println("number : " + number + " to string : " + strNumber);
		
	}
	public static void main1(String[] args)
	{
		// primitive type are itself not classes, so need wrapper class
		
		int number = 10;
		
		String strNumber = Integer.toString(number);
		
		System.out.println("number " + number + " to string : " + strNumber);
		
	}
	
	

}


