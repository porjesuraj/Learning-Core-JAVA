package test;

class Employee{
	
}

public class Program {
	private static int GetHashCode(int number) {
		int prime = 31;
		int result = 1;
		result = result * number + prime * number; 
		return result;
	}
	
	public static void main(String[] args) 
	{
		int number = 127;
		
		int hashcode = Program.GetHashCode(number);
		System.out.println(number + " " + hashcode);
		//127 4064
	
	}
	public static void main1(String[] args) 
	{
		Employee emp = new Employee();
		
		int hashcode = emp.hashCode(); // 4aa298b7
		System.out.println(Integer.toHexString(hashcode));
	}
	
}