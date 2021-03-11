package test;

interface A{
	void print( );
}
class B implements A{
	public void print()throws RuntimeException {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause); //Exception Chaining
		}
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			A a = new B( );	//Upcasting
			a.print();
		} catch (RuntimeException e) {
			//Throwable t = e.getCause();
			e.printStackTrace();
		}
	}
}
