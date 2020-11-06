package test;
//top level class
class Outer { // outer class
	// static nested class
	static class Inner{ // Outer$Inner.class
		
	}
}




public class Program { // Proram.class

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		Outer.Inner i = new Outer.Inner();
 
		
	}

}
