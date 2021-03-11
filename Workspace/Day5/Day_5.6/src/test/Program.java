package test;
public class Program {
	
	private static int count;
	public static void print( ) {
		//int count = 0; // NOT OK
		
		count = count + 1;
		System.out.println("Count	:	"+count);
	}
	public static void main(String[] args) {
		Program.print();	//1
		Program.print();	//1
		Program.print();	//1
	}
}
	

            