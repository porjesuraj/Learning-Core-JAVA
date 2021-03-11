package test;
@FunctionalInterface
interface Calculator{
	int factorial( int number );
}
public class Program {
	public static void main(String[] args) {
		Calculator c = number-> {
			int result = 1;
			for( int count = 1; count <= number; ++ count )
				result = result * count;
			return result;
		};
		int result = c.factorial(5);
		System.out.println(result);
	}
}
