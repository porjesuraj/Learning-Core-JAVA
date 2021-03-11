package test;

interface A{
	
	// int num ; // not ok 
	int num = 10; 
	//public static final int num = 10;
	
	
	void print();
	//public abstract void print( );
}

//Service Providers
class B implements A // interference implementation inheritence 
{

	@Override
	public void print() {
		System.out.println("Number " + this.num);
		
	}
	
	
	
}



public class Program { // Program.class
	public static void main(String[] args) {
		
		A a = new B();
		a.print(); // dynamic method dispatch
		}
	public static void main1(String[] args) {
	
	B b = new B();
	b.print();
	}

}
