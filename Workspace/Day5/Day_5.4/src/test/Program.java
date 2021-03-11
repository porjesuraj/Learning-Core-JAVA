package test;

public class Program {
	
	private int num1 = 10;
	private static int num2 = 20;
	
	public static void main(String[] args) {
		
		
		//System.out.println("Num1 : " + num1); // Not Ok
		
		Program p1 = new Program();
		System.out.println("Num1 : " + p1.num1);
		
		
		
		System.out.println("Num2 : " + num2); // 20
		
		
	  
	}
}

     