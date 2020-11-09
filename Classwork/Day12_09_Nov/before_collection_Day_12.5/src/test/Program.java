package test;

@FunctionalInterface
interface A{	//Functional Interface / Single(S) Abstract(A) Method(M) Interface / SAM Interface	
	void f1( );	//Functional method / method descriptor	
}

@FunctionalInterface
interface B{
	void f1( );
	static void f2( ) {
	}
	static void f3( ) {
	}
	default void f4( ) {
	}
	default void f5( ) {
	}
}
@FunctionalInterface

  interface C
  {  void f1( );
	//void f2( ); //error
}
   

public class Program {
	public static void main(String[] args) {

	}
}
