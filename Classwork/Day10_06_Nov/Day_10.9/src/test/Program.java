package test;
//top level class




public class Program { // Program.class

	public static void main(String[] args) {
		
		class Complex{
			
			private int real;
			private int imag;
			public Complex(int real, int imag) {
				super();
				this.real = real;
				this.imag = imag;
			}
			
			public Complex() {
				this(0,0);
			}

			@Override
			public String toString() {
				return "Complex [real=" + real + ", imag=" + imag + "]";
			}
			
			
		}
		
		Complex c1 = new Complex();
		Complex c2 = new Complex(10,20);
		
		System.out.println(c2.toString());
		
		
	}

}
