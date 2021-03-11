package test;
class Test{
	private static int num1;
	private static int num2;
	private static int num3;
	/*static {
		Test.num1 = 400;
		Test.num2 = 200;
		Test.num3 = 300;
		System.out.println("Inside static initializer block ");
	}*/
	
	
	static
	{
		System.out.println("Inside static initializer block 1");
	 
	  Test.num1 = 100;
	
	}
	
	static {
		  Test.num2 = 200;
		  System.out.println("Inside static initializer block 2");
	}
	static {
		 Test.num3 = 500;	
		 System.out.println("Inside static initializer block 3");
	}
	public Test( int num1, int num2 ) {
		
		System.out.println("Inside test constructor block" );
		System.out.println("Inside static initializer block 3");
		
	}
	@Override
	public String toString() {
		return "Test [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
	
	public static void print()
	{
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 );
		System.out.println("num3 = " +  num3);
	}
	
	
}
public class Program {
	
	static {
		System.out.println("inside  static initializer block of program");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside static block of program main");
		

		Test.print();
		
		
	  
	}
}

     