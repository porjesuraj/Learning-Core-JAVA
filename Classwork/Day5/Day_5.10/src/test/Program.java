package test;

import java.util.Scanner;

class Complex{
	private int real;
	private int imag;
	public Complex(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
	
	
	
	
	
}
public class Program {
	public static void main(String[] args) {
		
		
		final Complex c1 = new Complex(10,20);
		
		System.out.println(c1.toString());
		c1.setReal(100);
		c1.setImag(200);
		// c1 = new Complex(30,40);
		System.out.println(c1.toString());
	}
	
}
	

            