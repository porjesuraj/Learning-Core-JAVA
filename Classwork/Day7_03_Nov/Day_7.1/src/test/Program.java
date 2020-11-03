package test;

class Test implements AutoCloseable{
	
	public Test() {
		System.out.println("inside constructor");
	}
	public void print() {
		
		System.out.println("inside print method");
	}
	@Override
	public void close() throws Exception {
		System.out.println("inside close method");
		
	}
	
}



public class Program {
	public static void main(String[] args) {
		Test t = null;
		t = new Test( );	//Resource
	  
		t.print();
	}
	
	
	
}
