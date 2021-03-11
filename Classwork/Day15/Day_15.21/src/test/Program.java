package test;

@FunctionalInterface
interface Calci{
	int sum(int num1,int num2);
}
public class Program {
	
	public static void main(String[] args) {
	
		//Calci c = (int num1,int num2)->System.out.println("result : "+ (num1 + num2));
		Calci c = 	( int num1, int num2 )-> num1 + num2;
		int result = c.sum(20, 30);
		System.out.println(result);
	}

} 







