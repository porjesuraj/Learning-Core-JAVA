package test;

class A{
   public void print(int number) {
	   System.out.println("A.print");
	   
   }
}
class B extends A
{
	@Override
	public void print(int number) {
		
		
		
		System.out.println("B.print");
	}
	
	
}



public class Program {

	public static void main(String[] args) {
	
		B b = new B();
		
		//b.print(1);
		
		A a = new B(); // upcasting 
		
		a.print(1); // print B.print // i.e overriding is done 

	}

}
