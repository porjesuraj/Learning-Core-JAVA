package test;

class A extends Exception{	}
class B extends Exception{	}
class C extends Exception{	}
public class Program {
	//public void print( String str ) throws A, B, C {
	public static void print( String str ) throws Exception {
		if( str == null )
			throw new A( );
		if( str == " ")
			throw new B( );
		if( str == "empty")
			throw new C( );
		System.out.println(str);
	}
	public static void main(String[] args) {
		try {
			Program.print("DAC");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
