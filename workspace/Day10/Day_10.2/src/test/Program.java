package test;
//top level class
class Outer { // outer class
	// nested class
	class Inner{ // Outer$Inner.class
		
	}
}




public class Program { // Proram.class
	public static void main(String[] args) {
		
	   
	   
	    Outer.Inner in = new Outer().new Inner();

			
			
		}
	public static void main1(String[] args) {
		
    Outer out = new Outer();
   
    Outer.Inner in = out.new Inner();

		
		
	}

}
