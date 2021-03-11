package test;

interface A{
	void f1(); 
	void print();
}
interface B{
	void f2(); 
	void print();
}

abstract class C {
	abstract void f3();
	abstract void print();
	
}

class D extends C implements A,B{

	@Override
	public void f2() {
		System.out.println("D.B.f2()");
		
	}

	@Override
	public void f1() {
		System.out.println("D.A.f1()");
		
	}

	@Override
	void f3() {
		System.out.println("D.C.f3()");
		
	}

	@Override
	public
	void print() {
	
		System.out.println("Inside print");
	}
	
}



public class Program { // Program.class
	public static void main(String[] args) {
		
		A a = new D();
		a.f1();
		a.print();
		
	    B b = new D();
		b.f2();
		
	    b.print();
	    
	    C c = new D();
	    c.f3();
	    c.print();
	    
	    D d = new D();
	    
	    d.print();
	    
	    
		
		
			
		}
	public static void main1(String[] args) {
	
		D d = new D();
		
		d.f1();
		d.f2();
		d.f3();
				
		
			
		}
	

}
