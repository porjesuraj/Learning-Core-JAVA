package test;
//top level class
class Outer { // outer class
	
	private int num1 = 10;

	class Inner{ // Outer$Inner.class
		
		private int num1 = 20 ; // ok 
		 
		public void print() {			
			System.out.println("Num1 : " + num1);	       
			System.out.println("Num1 : " + Outer.this.num1);
			System.out.println("Num1 : " + this.num1 );
			
		}
		
	}
	
	
	
	
}




public class Program { // Proram.class
	public static void main(String[] args) {
		
	   Outer.Inner in = new Outer().new Inner();
	   in.print();
	   
	 
			
			
		}
	

}
