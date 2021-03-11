package test;

public class Program {

	public static void Sum(int... arguments)
	{
		int result = 0;
		for(int element : arguments)
		{
			result += element; 
			
		}
		System.out.println("result : " + result);
	}
	public static void main(String[] args) {
		
	Integer n1 = new Integer("125");
	
	int n2 = n1.intValue(); // Unboxing
	
	int n3 = n1; //Auto-unboxing 
	// int n3 = n1.intValue();
	System.out.println(n3);
	
	
		

	}
	
	
	public static void main2(String[] args) {
	
		Program.Sum();
		Program.Sum(0);
		Program.Sum(10,20);
		Program.Sum(10,20,30,40);
		Program.Sum(10,20,30,40,50,60);
		
		

	}

	public static void main1(String[] args) {
	
		System.out.println("hello world \n");
		
		String str = "Suraj";
		
		System.out.printf("Name : %s \n",str);
		
		int empid = 33;
		float salary = 45000.5f;
		System.out.printf("%-10s%-5d%-8.2f \n",str,empid,salary);
		

	}

}
