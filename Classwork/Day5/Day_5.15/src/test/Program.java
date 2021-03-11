package test;

import java.util.Arrays;
class Complex{
	private int real;
	private int imag;
	public Complex() {
		this.real = 10;
		this.imag = 20;
	}
	public void print( ) {
		System.out.println("Real Number	:	"+this.real);
		System.out.println("Imag Number	:	"+this.imag);
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
	
	
}
public class Program {
	
	
public static void main(String[] args) {
		
	
		Complex[] complex = new Complex[3];
		
		
		
		for (int i = 0; i < complex.length; i++) {
			complex[i] = new Complex(); //aray of objects
		}
		
		
		
		System.out.println(Arrays.toString(complex));//[Complex [real=10, imag=20], Complex [real=10, imag=20], Complex [real=10, imag=20]]
		
		
	}
public static void main1(String[] args) {
		
		Complex[] complex = new Complex[3];
		
		System.out.println(Arrays.toString(complex));//[null, null, null]
		
		
	}

}
