package test;



public class Program {
	private static void swap(int a,int b)
	{
		int temp = a;
		a = b;
		
		b = temp;
	}
	private static void swap(int[] arr )
	{
		int temp =arr[0];
		arr[0] = arr[1];
		
		arr[1] = temp;
	}
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int[] arr = new int[] {a,b}; 
		Program.swap(arr);
		
		a = arr[0];
		b = arr[1];
		System.out.println("a :" +  a);
		System.out.println("b :" +  b);
		
		}
public static void main1(String[] args) {
		
	int a = 10;
	int b = 20;
	//Program.swap(a, b);
	
	System.out.println("a :" +  a);
	System.out.println("b :" +  b);
	
	}

}
