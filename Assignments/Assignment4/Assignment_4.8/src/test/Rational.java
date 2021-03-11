package test;

public class Rational {

	private int numerator;
	private int denominator;
	public Rational(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public Rational() {
		// TODO Auto-generated constructor stub
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	@Override
	public String toString() {
		return "Rational number =  " + numerator + "/ " + denominator + "";
	} 
	
	
	
}

/*Q.8 (Rational Numbers)
Create a class called Rational for performing arithmetic with
fractions.
Write a program to test your class.
Use integer variables to represent the private instance
variables of the class—the numerator and the denominator.
Provide a constructor that enables an object of this class to be
initialized when it’s declared. The constructor should store the
fraction in reduced form.
The fraction 2/4 is equivalent to 1/2 and would be stored in
the object as 1 in the numerator and 2 in the denominator.
Provide a no-argument constructor with default values in case no
initializers are provided. Provide public methods that perform
each of the following operations:
a) Add two Rational numbers: The result of the addition should
be stored in reduced
form. Implement this as a static method.
b) Subtract two Rational numbers: The result of the subtraction
should be stored in reduced form. Implement this as a static
method.
c) Multiply two Rational numbers:
The result of the multiplication should be stored in reduced
form. Implement this as a static method.
d) Divide two Rational numbers: The result of the division
should be stored in reduced form.
Implement this as a static method.
e) Return a String representation of a Rational number in the
form a/b, where a is the numerator and b is the denominator.
f) Return a String representation of a Rational number in
floating-point format. (Consider providing formatting
capabilities that enable the user of the class to specify the
number of digits of precision to the right of the decimal
point.)
3*/