package test;
class Test{
	private int num1;
	private int num2;
	private static int num3;
	static
	{
		System.out.println("Inside static initializer block of class test");
	  Test.num3 = 500;	
	}
	public Test( int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Inside test constructor block" );
		
	}
	@Override
	public String toString() {
		return "Test [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
	
	public void print()
	{
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 );
		System.out.println("num3 = " +  num3);
	}
	
	
}
public class Program {
	
	static {
		System.out.println("inside static initializer block of program");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside static block of program main");
		
		Test t1 = new Test( 10, 20 );
		Test t2 = new Test( 30, 40 );
		Test t3 = new Test( 50, 60 );
		
		t1.print();
		t2.print();
		t3.print();
	  
	}
}

     