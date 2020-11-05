package test;




public class Program {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10; 
		
		if(num1.equals(num2)) // cannot invoke equals method on primitive data type
		System.out.println("equal");

		else
		System.out.println("not equal");
		
		// output: equal 
			
			
		}// output: compile error

	public static void main1(String[] args) {
	
	int num1 = 10;
	int num2 = 10; 
	
	if(num1 == num2)
	System.out.println("equal");

	else
	System.out.println("not equal");
	
	// output: equal 
		
		
	}
	

}
