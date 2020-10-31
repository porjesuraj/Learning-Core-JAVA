package test;

public class Program {

	public static void main(String[] args) {
		
	 
		RationalTest test = new RationalTest();
		Rational r1 = new Rational(20, 5);
		
		Rational r2 = new Rational();
		
		
		test.acceptRationalNumber(r2);
		
		System.out.println("using rational Operation methods \n \n \n  ");
		RationalTest.Add(r1, r2);
		
		RationalTest.Sub(r1, r2);
		
		RationalTest.Multiplication(r1, r2);
		
		RationalTest.Division(r1, r2);
		
		System.out.println("using  toString method \n \n \n  ");
		
		System.out.println( r1.toString());
		
		System.out.println( r2.toString());
	     
		System.out.println("using display method ");
		test.DisplayFloatValueOfNumber(r1);
		test.DisplayFloatValueOfNumber(r2);
		

	}

}
