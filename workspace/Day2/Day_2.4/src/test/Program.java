package test;


public class Program {
	
	public static void main(String[] args)
	{
		double num1 = 10.5;//Initialization
		int num2 = (int) num1; //narrowing 
		System.out.println("Num2  : " + num2);
		
	}
	
	
	
	public static void main2(String[] args)
	{
		int num1 = 10;//Initialization
		//double num2 = (double) num1 ;// widening 
		double num2 =  num1 ; //widening 
		System.out.println("Num2  : " + num2);
		
	}
	
	
	
	public static void main1(String[] args)
	{
		int num1 = 10;//Initialization
		int num2 = num1 ;//Initialization
		System.out.println("Num2  : " + num2);
		
	}
	

}


