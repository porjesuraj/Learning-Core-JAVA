package test;

import java.util.Scanner;

public class RationalTest {
	
static	Scanner sc = new Scanner(System.in);
	
	public void acceptRationalNumber(Rational r1)
	{
		System.out.println("please enter numerator");
		
		int a = sc.nextInt();
		
        System.out.println("please enter denominator");
		
		int b = sc.nextInt();
		
		int hcf =  RationalTest.findHcf(a, b);
		
		int numer = a/hcf; 
		
		int denom = b/hcf;
		
		r1.setNumerator(numer);
		r1.setDenominator(denom);
				
	}
	
	public void DisplayFloatValueOfNumber(Rational r1)
	{
		float num1 = r1.getNumerator();
		float den1 = r1.getDenominator();
		
		float number = num1 / den1; 
		
	     System.out.format("the rational number in float = %10.2f ", number);
		
	}
	
	
	public static int findHcf(int a,int b)
	{ 
		int hcf = 0;
		
		for(int i = 1; i <= a || i <= b; i++)
		{
			if(a % i == 0 && b % i == 0)
			{
				hcf = i; 
			}
			
		}
		
		return hcf;
	}
	
	public static int findLCM(int a,int b)
	{
		int max, step, lcm = 0;
	      
	      if(a > b){
	         max = step = a;
	      }
	      else{
	         max = step = b;
	      }

	      while(a!= 0) {
	         if(max % a == 0 && max % b == 0) {
	            lcm = max;
	            break;
	         }
	         max += step;
	      }
	      return lcm;
	}
	
	
	
	
	public static void Add(Rational r1,Rational r2)
	{
		int num = 0;
		int den = 0;
		
		if(r1.getDenominator() == r2.getDenominator())
		{
			num = r1.getNumerator() + r2.getNumerator(); 
			
			den = r1.getDenominator(); 
			
		   
		   
		   
		} else
		{
			int lcm = RationalTest.findLCM(r1.getDenominator(), r2.getDenominator());
			
			
			int num1 = r1.getNumerator() * r2.getDenominator(); 
			
			int num2 = r2.getNumerator() * r1.getDenominator();
			
			 num = num1 + num2; 
			
			den = lcm; 
			
			
		}
		
		int hcf = 	RationalTest.findHcf(num, den);
		
		int numAdded = num/hcf;
		
		int denAdded = den/hcf;
		
		
		System.out.println("addtion of two rational no, in reduced form =  " + numAdded + " / " + denAdded);
		
	}
	
	public static void Sub(Rational r1,Rational r2)
	{
		int num = 0;
		int den = 0;
		
		if(r1.getDenominator() == r2.getDenominator())
		{
			 num = Math.abs(r1.getNumerator() - r2.getNumerator()) ; 
			
			den = r1.getDenominator(); 
			
		   
		   
		   
		} else
		{
			int lcm = RationalTest.findLCM(r1.getDenominator(), r2.getDenominator());
			
			
			int num1 = r1.getNumerator() * r2.getDenominator(); 
			
			int num2 = r2.getNumerator() * r1.getDenominator();
			
			 num = Math.abs(num1 - num2) ; 
			
			den = lcm; 
			
			
		}
		
		int hcf = 	RationalTest.findHcf(num, den);
		
		int numAdded = num/hcf;
		
		int denAdded = den/hcf;
		
		
		System.out.println("substraction of two rational no, in reduced form =  " + numAdded + " / " + denAdded);
		
	}
	
	public static void Multiplication(Rational r1,Rational r2)
	{
		int num = 0;
		int den = 0;
		
		
			 num = r1.getNumerator() * r2.getNumerator(); 
			
			den = r1.getDenominator() * r2.getDenominator(); 
			
		   
		   
		   
		
		
		int hcf = 	RationalTest.findHcf(num, den);
		
		int numAdded = num/hcf;
		
		int denAdded = den/hcf;
		
		
		System.out.println("multiplication of two rational no, in reduced form =  " + numAdded + " / " + denAdded);
		
	}
	public static void Division(Rational r1,Rational r2)
	{
		int num = 0;
		int den = 0;
		
		
			 num = r1.getNumerator() * r2.getDenominator(); 
			
			den = r1.getDenominator() * r2.getNumerator(); 
			
		   
		   
		   
		
		
		int hcf = 	RationalTest.findHcf(num, den);
		
		int numAdded = num/hcf;
		
		int denAdded = den/hcf;
		
		
		System.out.println("Division of two rational no, in reduced form =  " + numAdded + " / " + denAdded);
		
	}

}

