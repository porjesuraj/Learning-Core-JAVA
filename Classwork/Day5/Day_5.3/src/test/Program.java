package test;

import java.util.Scanner;

class Test{
	private  int num1;
	private  int num2;
	private static int num3;
	
	static {
		Test.num3 = 20;
	}
	
	public Test()
	{
		this(10,20);
	}
	
	public Test(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public static int getNum3() {
		return num3;
	}

	public static void setNum3(int num3) {
		Test.num3 = num3;
	}
	
	
	
}
public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(Test t)
	{

		System.out.println("num1 = "  );
		t.setNum1(sc.nextInt());
		System.out.println("num2 = " );
		t.setNum2(sc.nextInt());
		System.out.println("num3 = " );
		t.setNum3(sc.nextInt());
	}
	
	public static void printRecord(Test t)
	{
		System.out.println("num1 = " + t.getNum1() );
		System.out.println("num2 = " +  t.getNum2() );
		System.out.println("num3 = " + Test.getNum3()  );
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		
		Program.acceptRecord(t);
		Program.printRecord(t);
		
	}
	
}

     