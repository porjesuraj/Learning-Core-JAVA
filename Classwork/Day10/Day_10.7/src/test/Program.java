package test;
//top level class
class Outer { // outer class
	
private int num1 = 10;
private static int num2 = 20; 
	static class Inner{ // Outer$Inner.class
		
		private int num3 = 30;
		private static int num4 = 40;
		
	}
	
	public void print()
	{
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+Outer.num2);
		
		//System.out.println("Num3	:	"+num3);	//Not OK
		//System.out.println("Num4	:	"+num4);	//Not OK
		
		Inner in = new Inner();	//OK
		
		System.out.println("Num3	:	"+in.num3);	//OK
		System.out.println("Num4	:	"+Inner.num4);	//OK

	}
}




public class Program { // Proram.class

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		o.print();
		
	}

}
