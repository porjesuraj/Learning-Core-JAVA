package test;
//top level class
class Outer { // outer class
	
	private int num1 = 10;
	private static int num2 = 20;
	//Non static nested class / Inner class
	class Inner{ // Outer$Inner.class
		
		private int num3 ; // ok 
		private static final int num4 = 40; 
		
		
	}
	
	public void print() {
		
		System.out.println("Num1 : " + this.num1);
		System.out.println("Num2 : " + Outer.num2);
		
                Inner i = new Inner();
		System.out.println("Num3 : " + i.num3 );
		System.out.println("Num4 : " + Inner.num4 );
		
	}
	
	
}




public class Program { // Proram.class
	public static void main(String[] args) {
		
	   Outer out = new Outer();
	   
	   out.print();
	   
	 
			
			
		}
	

}
