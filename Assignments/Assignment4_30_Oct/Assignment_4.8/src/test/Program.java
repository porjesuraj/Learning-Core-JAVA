package test;

public class Program {

	public static void main(String[] args) {
		
	 
		RationalTest test = new RationalTest();
		Rational r1 = new Rational(20, 5);
		
		Rational r2 = new Rational();
		
		
		test.acceptRationalNumber(r2);
		
		System.out.println("using rational Operation methods \n  ");
		
		RationalTest.Add(r1, r2);
		
		System.out.println("\n");
		
		RationalTest.Sub(r1, r2);
		
		System.out.println("\n");
		
		RationalTest.Multiplication(r1, r2);
		
		System.out.println("\n");
		
		RationalTest.Division(r1, r2);
		
		System.out.println("\n");
		
		System.out.println("using  toString method \n  ");
		
		System.out.println( r1.toString());
		
		System.out.println("\n");
		
		System.out.println( r2.toString());
		
	     
		System.out.println("using display method  \n");
		
		test.DisplayFloatValueOfNumber(r1);
		
		System.out.println("\n");
		
		test.DisplayFloatValueOfNumber(r2);
		

	}

}
